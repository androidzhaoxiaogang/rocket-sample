package fast.rocket.sample;

public class LoginResult {
	private boolean is_succ;
	private boolean succ;
	private String err_msg;
	private String url;

	public boolean isIs_succ() {
		return is_succ;
	}

	public void setIs_succ(boolean is_succ) {
		this.is_succ = is_succ;
	}

	public boolean isSucc() {
		return succ;
	}

	public void setSucc(boolean succ) {
		this.succ = succ;
	}

	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "LoginResult [is_succ=" + is_succ + ", succ=" + succ
				+ ", err_msg=" + err_msg + ", url=" + url + "]";
	}

}
