package drill;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseTestDto {

	/**
	 * タイムスタンプ
	 */
	@JsonProperty("@timestamp")
	public String timestamp;

	/**
	 * テストID
	 */
	public String testId;

	/**
	 * kind(Java, SQL, Web)格納
	 * Java, SQL, Web
	 */
	public String kind;

	/**
	 * score(テスト結果)格納
	 * 1:可  0:不可
	 */
	public int score;

	/**
	 * 最大点数
	 */
	public int maxScore;

	/**
	 * 問題番号
	 */
	public String questionNumber;

	/**
	 * 社員名
	 */
	public String employeeNameNumber;

	/**
	 * 社員名
	 */
	public String employeeName;

	/**
	 * 社員番号
	 */
	public String employeeNumber;

	/**
	 * PC番号
	 */
	public String machineNumber;

	/**
	 * コメント
	 */
	public String comment;

	/**
	 * 問題内容
	 */
	public String contents;

	/**
	 * エラーコード
	 */
	public String errorCode;

	/**
	 * エラー名
	 */
	public String errorName;

	/**
	 * エラーメッセージ
	 */
	public String errorMessage;

	/**
	 * IP
	 */
	@JsonProperty("IP")
	public String ip;

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}

	public String getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(String questionNumber) {
		this.questionNumber = questionNumber;
	}

	public String getEmployeeNameNumber() {
		return employeeNameNumber;
	}

	public void setEmployeeNameNumber(String employeeNameNumber) {
		this.employeeNameNumber = employeeNameNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getMachineNumber() {
		return machineNumber;
	}

	public void setMachineNumber(String machineNumber) {
		this.machineNumber = machineNumber;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String iP) {
		this.ip = iP;
	}

}
