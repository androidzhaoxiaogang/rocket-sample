package fast.rocket.sample;

import java.util.List;

public class FundResult {
	private boolean is_succ;
	private boolean succ;
	private String profit;
	private String dataDate;
	private String err_msg;
	//private List<FundInfo> infos;
	
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
	
	public String getProfit() {
		return profit;
	}
	public void setProfit(String profit) {
		this.profit = profit;
	}
	public String getDataDate() {
		return dataDate;
	}
	public void setDataDate(String dataDate) {
		this.dataDate = dataDate;
	}
//	public List<FundInfo> getInfos() {
//		return infos;
//	}
//
//	public void setInfos(List<FundInfo> infos) {
//		this.infos = infos;
//	}
	@Override
	public String toString() {
		return "FundResult [is_succ=" + is_succ + ", succ=" + succ
				+ ", profit=" + profit + ", dataDate=" + dataDate
				+ ", err_msg=" + err_msg + ", infos="  + "]";
	}

	
	

}
