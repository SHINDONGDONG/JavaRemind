package chap08;

interface Greeting{
	public String sayHello(String name);
}
public class Sample13 {
	public static void main(String[] args) {
		Greeting greeting =new Greeting() {
			@Override
			public String sayHello(String name) {
				return name;
			}
		};
		System.out.println(greeting.sayHello("빵형은 바보"));
		
		Greeting g = (name)-> name + "안녕!";
		System.out.println(g.sayHello("람다식 빵형"));
	}

}
