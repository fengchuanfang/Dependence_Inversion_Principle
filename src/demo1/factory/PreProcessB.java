package demo1.factory;

//ԭ��Ԥ������
public class PreProcessB implements IPreProcess{

	@Override
	public String preProcess(String material) {
		return "%" + material + "����>";
	}

}
