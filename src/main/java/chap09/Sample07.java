package chap09;

public class Sample07 {

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.study();
		Person2 p2 = new Person2();
		p2.teach();
	//스튜던트로 제한
		Student p3 = new Person3();
		p3.study();
//		p3.teach();
	}

}

interface Student {
	void study();
}
interface Teacher {
	void teach();
}

class Person1 implements Student{

	@Override
	public void study() {
		System.out.println("1공부한다.");
	}
	
}
class Person2 implements Teacher{

	@Override
	public void teach() {
		System.out.println("2가르친다.");
	}
	
}
class Person3 implements Student, Teacher{

	@Override
	public void teach() {
		System.out.println("3가르친다.");
	}
	@Override
	public void study() {
		System.out.println("3공부한다.");
	}
	
}