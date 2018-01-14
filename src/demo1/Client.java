package demo1;

import demo1.factory.FactoryX;
import demo1.factory.FactoryY;
import demo1.factory.IFactory;
import demo1.factory.IPackaging;
import demo1.factory.Packaging;
import demo1.factory.Process;
import demo1.factory.Process2;
import demo1.factory.PreProcess;
import demo1.factory.PreProcessA;
import demo1.factory.PreProcessB;

public class Client {

	public static void main(String[] args) {
		produce(new FactoryX(new Packaging(new Process2(new PreProcess()))));
		produce(new FactoryY(new Packaging(new Process(new PreProcess()))));
	}
	
	private static void produce(IFactory factory){
		System.out.println(factory.process("‘≠¡œ"));
	}
}
