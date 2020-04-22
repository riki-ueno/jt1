package drill;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

public class BaseTest {

	/**
	 * タイムスタンプ
	 */
	public static String timestamp;

	/**
	 * テストID
	 */
	public static String testId;

	/**
	 * kind(Java, SQL, Web)格納
	 * Java, SQL, Web
	 */
	public static String kind;

	/**
	 * score(テスト結果)格納
	 * 1:可  0:不可
	 */
	public static int score;

	/**
	 * 最大点数
	 */
	public static int maxScore;

	/**
	 * 問題番号
	 */
	public static String questionNumber;

	/**
	 * 社員名
	 */
	public static String employeeNameNumber;

	/**
	 * 社員名
	 */
	public static String employeeName;

	/**
	 * 社員番号
	 */
	public static String employeeNumber;

	/**
	 * PC番号
	 */
	public static String machineNumber;

	/**
	 * コメント
	 */
	public static String comment;

	/**
	 * 問題内容
	 */
	public static String contents;

	/**
	 * エラーコード
	 */
	public static String errorCode;

	/**
	 * エラー名
	 */
	public static String errorName;

	/**
	 * エラーメッセージ
	 */
	public static String errorMessage;

	/**
	 * IP
	 */
	public static String ip;

	/**
	 * 待機時間を指定する（ミリセック）
	 */
	public static final int WAIT_TIME = 3000;

	protected final ByteArrayOutputStream out = new ByteArrayOutputStream();

	@Rule
	public TestName testName = new TestName();

	/* ****** 事前・事後実行 */

	/**
	 * クラス実行前に、共通フィールド初期化
	 * @throws Exception
	 */
	@BeforeClass
	public static void classSetup() throws Exception {
		maxScore = 1;
		kind = "Java";
		// ユーザー情報抽出
		String userName = System.getProperty("user.name");
		employeeNameNumber = userName;
		// 後ろ4文字は社員番号
		employeeNumber = userName.substring(userName.length() - 4);
		// それ以前は、社員名（苗字）
		employeeName = userName.substring(0, userName.length() - 4);
		// PC情報抽出
		machineNumber = InetAddress.getLocalHost().getHostName();
		// IP情報抽出
		getIp();
	}

	/**
	 * 各メソッド実行前に、初期化＆ドライバ起動
	 * @throws Exception
	 */
	@Before
	public void methodSetup() throws Exception {
		// Javaソース上の出力とかぶるので、出力を別に
		System.setOut(new PrintStream(out));

		// フィールド初期化
		fieldSetup();

	}

	/**
	 * フィールドの初期化
	 */
	public static void fieldSetup() {
		// フィールド初期化
		score = 0;
		questionNumber = "";
		comment = "";
		contents = "";
		errorCode = "";
		errorName = "";
		errorMessage = "";
	}

	/**
	 * 各メソッド終了時に、REST送信
	 * @throws Exception
	 */
	@After
	public void methodShutdown() throws Exception {
		// REST送信
		//TestOther.sendRest();
	}

	/**
	 * クラス終了時に、ドライバーを閉じる
	 * @throws Exception
	 */
	@AfterClass
	public static void classShutdown() throws Exception {
	}

	private static void getIp() {
		Enumeration<NetworkInterface> n;
		try {
			n = NetworkInterface.getNetworkInterfaces();
			while (n.hasMoreElements()) {
				NetworkInterface e = n.nextElement();
				Enumeration<InetAddress> a = e.getInetAddresses();
				while (a.hasMoreElements()) {
					InetAddress addr = a.nextElement();
					if (!addr.getHostAddress().equals("127.0.0.1")) {
						if (addr.getHostAddress().startsWith("10")) {
							ip = addr.getHostAddress();
							System.out.println(addr.getHostAddress());
						}

					}
				}
			}
		} catch (SocketException e1) {
			// ignore
			e1.printStackTrace();
		}

	}

}