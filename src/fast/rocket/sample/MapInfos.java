package fast.rocket.sample;

import java.util.List;

public class MapInfos {
	private int result;//返回的结果状态，0则表示出错，1为正常处理
	private List<MapInfo> array; //地图信息列表

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public List<MapInfo> getArray() {
		return array;
	}

	public void setArray(List<MapInfo> array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "MapInfos [result=" + result + ", array=" + array + "]";
	}

	
}
