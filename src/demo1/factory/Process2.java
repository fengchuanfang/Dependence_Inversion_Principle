package demo1.factory;

public class Process2 implements IProcess{
	private IPreProcess preProcess;

	public Process2(IPreProcess preProcess) {
		this.preProcess = preProcess;
	}

	@Override
	public String process(String material) {
		return this.preProcess.preProcess(material) + "优化加工——>";
	}
}
