package chap10;


//제네릭 메서드

//[접근제어자] (static) <E> [반환될 자료형] [메서드명] (E e) {

class Data {
	String value;
	
	public <T> void setValue(T t) {
		this.value = t.toString();
	}

	public String getValue() {
		return value;
	}
}

public class Sample12 {

	public static void main(String[] args) {
		Data data =new Data();
		data.setValue(3);
		data.setValue("4");
		System.out.println(data.getValue());
	}
}
