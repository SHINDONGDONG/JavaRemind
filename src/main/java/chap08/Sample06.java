package chap08;

public class Sample06 {
//재귀함수 자기자신을 불러와 실행한다.
	
	static int sum;
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	public static int sum(int a) {
		sum += a;
		if(a ==0) {
			return sum;
		}
		else {
			return sum(--a);
		}
	}

}
