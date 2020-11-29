package chap08;

interface Bow{
	String sayHello();
	String bye();
}
public class Sample14 {

	public static void main(String[] args) {
		Bow bow = new Bow() {
			String name = "빵형 ";
			@Override
			public String sayHello() {
				return name + "안녕";
			}
			@Override
			public String bye() {
				return name + "잘가";
			}
		};
		System.out.println(bow.bye());
		
	}

}
