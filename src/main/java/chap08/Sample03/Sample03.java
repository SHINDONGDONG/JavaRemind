package chap08.Sample03;

public class Sample03 {

	public static void main(String[] args) {
		Data data = new Data();
		data.setValue(10);
		System.out.println(data.getValue());
		
		Compute c = new Compute();
		c.setValue(4);
		c.setValue(10, 2);
		System.out.println(c.getValue());
		
		
	}

}
