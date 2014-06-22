package fast.rocket.sample;

public class QuestionInfo {
	private String questionID;
	private String questionName;
	private String questionCount;
	public String getQuestionID() {
		return questionID;
	}
	public void setQuestionID(String questionID) {
		this.questionID = questionID;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(String questionCount) {
		this.questionCount = questionCount;
	}
	@Override
	public String toString() {
		return "QuestionInfo [questionID=" + questionID + ", questionName="
				+ questionName + ", questionCount=" + questionCount + "]";
	}
	
	

}
