package demo1.factory;

//原料预处理类
public class PreProcess implements IPreProcess{

	@Override
	public String preProcess(String material) {
		return "*" + material + "——>";
	}

}
