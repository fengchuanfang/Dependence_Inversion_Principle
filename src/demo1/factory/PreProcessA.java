package demo1.factory;

//原料预处理类
public class PreProcessA implements IPreProcess{

	@Override
	public String preProcess(String material) {
		return "#" + material + "——>";
	}

}
