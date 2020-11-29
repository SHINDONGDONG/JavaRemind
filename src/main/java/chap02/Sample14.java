package chap02;

public class Sample14 {

	public static void main(String[] args) {
		final float PI; //초기값 선언하지않ㅇㅁ
		PI = 3.14f; // 최초갑승ㄹ 선언후 초기값을 변경하려면 에러가남
		int radius = 10;
		float area = radius * radius * PI;
		System.out.printf("원의 넓이 : %f",area);
		
		
	}

}
