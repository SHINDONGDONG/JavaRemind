package chap02;

public class Sample02 {
	public static void main(String[] args) {
		byte a1 = -128; //byte 최소값
		byte a2 = 127; //byte 최대값
		
		short b1 = -32768;
		short b2 = 32767;
		
		int c1 = 10000; //int
		long d = 100000L;
		float f = 10.1f;
		double dd = 10.1;
		
		System.out.printf("byte : %d, \t\t short : %d%n", a1,a2 );
		System.out.printf("short : %d, \t short : %d%n", b1,b2 );
		System.out.printf("flaot : %f, \t double : %f%n", f,dd );
	}
}
