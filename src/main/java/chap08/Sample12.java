package chap08;

public class Sample12 {
//익명내부클래스
	public static void main(String[] args) {
		// 추상 클래스명 or 인터페이스명 객체명 = new 생성자 ()

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명내부 클래스 실행");
			}
		};
		r.run();
	}

}
