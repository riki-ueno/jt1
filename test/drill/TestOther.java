package drill;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

public class TestOther {

	/* ElasticSearch/Kibanaへの接続設定 案件ごとにここを変更する */
	// テストID。これごとにテストを集計する。
	public static final String TESTID = "20170605sbm";
	// ElasticSearch/Kibanaで使用するINDEX（プロジェクトを識別する値/assessmentは何でもよいが固定）
	public static final String KIBANA_INDEX = "201706sbm/assessment";
	// ElasticSearchのURL
	public static final String URL_BASE ="http://kibana.sbm.itcamp.io/";
	// POST先のURL
	public static final String URL_SEND_REST = URL_BASE + KIBANA_INDEX;
	// リクエストのメディアタイプ
	public static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json; charset=utf-8");

	/**
	 * テスト固有情報をセットする
	 *
	 * @param number
	 *            問題番号
	 * @param contents
	 *            問題内容
	 */
	public static void setQuestion(String number, String contents) {
		// テスト固有情報をセット
		BaseTest.questionNumber = number;
		BaseTest.contents = contents;
	}

	/* ****** REST系 */

	/**
	 * 判定がすべて通った場合、scoreを可とする
	 */
	public static void allSuccess() {
		BaseTest.score = 1;
	}

	/**
	 * 判定がすべて通った場合、scoreを0とする
	 */
	public static void failed() {
		BaseTest.score = 0;
	}

	public static void sendRest() {
		// ●REST送信

		// System.out.println(URL_SEND_REST);
		// 送信日時の取得
		Date date1 = new Date(); // (1)Dateオブジェクトを生成
		// (2)SimpleDateFormatオブジェクトを生成
		SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
		String year = sdfYear.format(date1);
		String time = sdfTime.format(date1);
		String timestamp = year + "T" + time + "+09:00";

		ObjectMapper mapper = new ObjectMapper();
		String json;
		try {

			// リクエスト作成
			BaseTestDto requestDto = new BaseTestDto();
			requestDto.setTimestamp(timestamp);
			requestDto.setTestId(TESTID);
			requestDto.setKind(BaseTest.kind);
			requestDto.setScore(BaseTest.score);
			requestDto.setMaxScore(BaseTest.maxScore);
			requestDto.setQuestionNumber(BaseTest.questionNumber);
			requestDto.setEmployeeNameNumber(BaseTest.employeeNameNumber);
			requestDto.setEmployeeName(BaseTest.employeeName);
			requestDto.setEmployeeNumber(BaseTest.employeeNumber);
			requestDto.setMachineNumber(BaseTest.machineNumber);
			requestDto.setComment(BaseTest.comment);
			requestDto.setContents(BaseTest.contents);
			requestDto.setErrorCode(BaseTest.errorCode);
			requestDto.setErrorName(BaseTest.errorName);
			requestDto.setErrorMessage(BaseTest.errorMessage);
			requestDto.setIp(BaseTest.ip);

			json = mapper.writeValueAsString(requestDto);

			System.out.println(json);
			// リクエスト送信
			OkHttpClient client = getUnsafeOkHttpClient();
			Request request = new Request.Builder().url(URL_SEND_REST).post(RequestBody.create(MEDIA_TYPE_JSON, json))
					.build();
			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) {
				System.out.println("Unexpected code " + response);
			}
			// レスポンスのパース
			EsResponse res = mapper.readValue(response.body().charStream(), EsResponse.class);
			System.out.println(res.created);
		} catch (JsonProcessingException e) {
			// ignore
			e.printStackTrace();
		} catch (IOException e) {
			// ignore
			e.printStackTrace();
		}
	}

	/* ****** その他 */

	/**
	 * 処理を指定時間（ミリセック）の間停止する
	 *
	 * @param timeout
	 */
	public static void waitUntilTimeout(long timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			// do nothing
		}

	}

	/**
	 * SSL認証エラーを全て無視するOkHttpClientを返却する
	 *
	 * @return OkHttpClient
	 */
	private static OkHttpClient getUnsafeOkHttpClient() {
		try {
			// Create a trust manager that does not validate certificate chains
			final TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				@Override
				public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
				}

				@Override
				public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
				}

				@Override
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}
			} };

			// Install the all-trusting trust manager
			final SSLContext sslContext = SSLContext.getInstance("SSL");
			sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
			// Create an ssl socket factory with our all-trusting manager
			final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

			OkHttpClient okHttpClient = new OkHttpClient();
			okHttpClient.setSslSocketFactory(sslSocketFactory);
			okHttpClient.setHostnameVerifier(new HostnameVerifier() {

				@Override
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}

			});

			// okHttpClient.setProxy(new Proxy(Proxy.Type.HTTP, new
			// InetSocketAddress("10.42.5.10", 8000)));
			okHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);
			okHttpClient.setWriteTimeout(10, TimeUnit.SECONDS);
			okHttpClient.setReadTimeout(30, TimeUnit.SECONDS);

			return okHttpClient;
		} catch (

		Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * レスポンスマッピング用クラス
	 *
	 * @author ogawa1863 add _shards 201604 by matsuno
	 *
	 */

	@SuppressWarnings("unused")
	private static class _shards {
		// @JsonProperty("total");
		// @JsonProperty("successful");
		// @JsonProperty("failed");
		private int total;
		private int successful;
		private int failed;

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public int getSuccessful() {
			return successful;
		}

		public void setSuccessful(int successful) {
			this.successful = successful;
		}

		public int getFailed() {
			return failed;
		}

		public void setFailed(int failed) {
			this.failed = failed;
		}

	}

	@SuppressWarnings("unused")
	private static class EsResponse {
		String _index;
		String _type;
		String _id;
		String _version;
		String _result;
		_shards _shards;
		boolean created;

		public String get_index() {
			return _index;
		}

		public void set_index(String _index) {
			this._index = _index;
		}

		public String get_type() {
			return _type;
		}

		public void set_type(String _type) {
			this._type = _type;
		}

		public String get_id() {
			return _id;
		}

		public void set_id(String _id) {
			this._id = _id;
		}

		public String get_version() {
			return _version;
		}

		public void setResult(String _result) {
			this._result = _result;
		}

		public String get_result() {
			return _result;
		}

		public void set_shards(_shards _shards) {
			this._shards = _shards;
		}

		public _shards get_shards() {
			return _shards;
		}

		public void set_version(String _version) {
			this._version = _version;
		}

		public void setCreated(boolean created) {
			this.created = created;
		}


	}

}
