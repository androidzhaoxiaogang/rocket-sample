package fast.rocket.sample;
public class MapInfo {
	private String address; //部门地址
	
	private String department;//部门名称

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "MapInfo [address=" + address + ", department=" + department
				+ "]";
	}

}
