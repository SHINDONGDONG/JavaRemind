package chap02;

public class Sample09 {

	public static void main(String[] args) {

		//문자열을 숫자로
		String a ="1234";
		int a2= Integer.parseInt(a);
		
		int b1 = 12345;
		String b2 = Integer.toString(b1);
		String b3 = String.valueOf(a2);
		String b4 = ""+ b2;
		//실수형
		float c1 = 1235.123f;
		String c2 = Float.toString(c1);
		String c3 = String.valueOf(c1);
		String c4 = ""+ c1;
		
		
		System.out.println("String to int : "+a2);
		System.out.println("int to String : "+b2);
		System.out.println("int to String : "+b3);
		System.out.println("int to String : "+b4);
		System.out.println("int to String : "+c2);
		System.out.println("int to String : "+c3);
		System.out.println("int to String : "+c4);

	}

}
