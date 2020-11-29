package chap08.Smaple21;

public class PrintServiceImpl {

	DataServiceImpl data = new DataServiceImpl();
	
	public void printMsg() {
		System.out.printf("hello %s",data.getName());
	}
}
