package fast.rocket.sample;

import java.util.List;

public class MapInfos {
	private int result;//���صĽ��״̬��0���ʾ����1Ϊ��������
	private List<MapInfo> array; //��ͼ��Ϣ�б�

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
