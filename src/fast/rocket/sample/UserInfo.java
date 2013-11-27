package fast.rocket.sample;

public class UserInfo {

	private String result;
	private String name;
	private String message;
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "UserInfo [result=" + result + ", name=" + name + ", message="
				+ message + "]";
	}
	
	
}
