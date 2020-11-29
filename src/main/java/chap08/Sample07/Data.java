package chap08.Sample07;

public class Data {

	String name;
	int age;
	
	public Data() {
		this("무명",0);
//		name="빵형";
//		age =21;
	}

	public Data(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}




}
