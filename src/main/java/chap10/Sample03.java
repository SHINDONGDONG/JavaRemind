package chap10;

public class Sample03 {

	public static void main(String[] args) {
		Sample01 age =new Sample01();
		Sample02 name =new Sample02();
		age.setA(18);
		name.setA("빵형");
		int personAge = age.getA();
		String personName = name.getA();
		System.out.printf("%s 는 %d 살이다.",personName,personAge);
	}

}
