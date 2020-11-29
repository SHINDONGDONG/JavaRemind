package chap08.Sample10;
//인스턴스 내부클래스
public class Smaple10 {

	public static void main(String[] args) {
		Student s = new Student("빵형");
		Student.Score sS = s.new Score();
		sS.eng = 10;
		sS.mat = 20;
		sS.showInfo();

	}

}
