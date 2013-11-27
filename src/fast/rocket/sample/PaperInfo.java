package fast.rocket.sample;

import java.util.List;

public class PaperInfo {
	private boolean result;
	
	private List<ExamInfo> exam;
	
	private String  message;

	public boolean isResult() {
		return result;
	}



	public void setResult(boolean result) {
		this.result = result;
	}



	public List<ExamInfo> getExam() {
		return exam;
	}



	public void setExam(List<ExamInfo> exam) {
		this.exam = exam;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "PaperInfo [result=" + result + ", exam=" + exam + ", message="
				+ message + "]";
	}
	
	
}
