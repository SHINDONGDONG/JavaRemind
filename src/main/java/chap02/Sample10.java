package chap02;

public class Sample10 {
	public static void main(String[] args) {
		String a1 = "abcd";
		char[] a2 = a1.toCharArray(); //문자열을 배열로 변환;
		
		char b1 = 'a';
		String b2  = String.valueOf(b1);
		String b3 = ""+b1;
		
		System.out.println("char : " + a2[0]);
		System.out.println("char : " + b2);
		System.out.println("char : " + b3);
	}
}
