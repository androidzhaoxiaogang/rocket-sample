package fast.rocket.sample;
public class MapInfo {
	private String address; //���ŵ�ַ
	
	private String department;//��������

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
