package fast.rocket.sample;

import java.util.List;

public class ExamInfo {
	private String examID;
	private String examName;
	private List<QuestionInfo> question;

	public String getExamID() {
		return examID;
	}

	public void setExamID(String examID) {
		this.examID = examID;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public List<QuestionInfo> getQuestion() {
		return question;
	}

	public void setQuestion(List<QuestionInfo> question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "ExamInfo [examID=" + examID + ", examName=" + examName
				+ ", question=" + question + "]";
	}

}
