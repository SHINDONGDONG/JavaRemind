package chap10;

class Computer1{
	private String compoClassName;
	
	public void toInfo() {
		System.out.println(compoClassName);
	}

	public <T extends CoputerPart>Computer1(T compoClassName) {
		this.compoClassName = compoClassName.getClass().getName();
	}
	
}
public class Sample09 {
	public static void main(String[] args) {
		Computer1 mem =new Computer1(new Memory());
		System.out.println(mem.getClass().getName());
	}
}
