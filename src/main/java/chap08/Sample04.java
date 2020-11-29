package chap08;

public class Sample04 {
	
	static int total = 0;
	public static void main(String[] args) {
		System.out.printf("결과 : %d\n",sum(1));
		System.out.printf("결과 : %d\n",sum(1,5));
		System.out.printf("결과 : %d\n",sum(1,5,8));
		System.out.printf("결과 : %d\n",sum(1,5,8,10));
		System.out.printf("결과 : %d\n",sum(1,5,8,10,69));
		
	}

	public static int sum(int ...a) {
		for(int all : a) {
			total += all;
		}
		return total;
	}
//	public static int sum(int a,int b) {
//		total += a + b;
//		return total;
//	}
//	public static int sum(int a,int b,int c) {
//		total += a + b + c;
//		return total;
//	}
}
