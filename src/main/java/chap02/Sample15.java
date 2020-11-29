package chap02;

import java.util.Random;

public class Sample15 {

	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(3)+1; //1~3까지
		System.out.printf("난수 : %d",num);
		
	}

}
