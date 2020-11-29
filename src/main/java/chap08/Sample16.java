package chap08;

public class Sample16 {

	public static void main(String[] args) {

		String A = new String("빵형");
		String B = "빵형";
		String C = "빵형";
		
		if(A == B) {
			System.out.println("A,B는 같다");
		}else {
			System.out.println("A,B는 다른주소이다");
		}
		if(A.equals(B)) {
			System.out.println("A,B는 같은값입니다.");
		}else {
			System.out.println("A,B는 다른값입니다.");
		}
		
		if(A.equals(C)) {
			System.out.println("A,C는 같은값입니다.");
		}else {
			System.out.println("A,C는 다른값입니다.");
		}
		
		
		System.out.printf("%s%s%s",A,B,C);
	}

}
