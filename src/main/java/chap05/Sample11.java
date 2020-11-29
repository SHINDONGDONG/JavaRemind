package chap05;

import java.util.Arrays;

public class Sample11 {

	public static void main(String[] args) {

		String[] han1 = new String[]
				{"라면","미역국","떡볶이","수제비","갈비탕","순대국"};
		String[] han2 = Arrays.copyOf(han1,han1.length-1);
		String[] han3 = Arrays.copyOf(han1,han1.length-2);
		String[] han4 = Arrays.copyOf(han1,han3.length-1);
		System.out.println(Arrays.toString(han1));
		System.out.println(Arrays.toString(han2));
		System.out.println(Arrays.toString(han3));
		System.out.println(Arrays.toString(han4));
		System.out.println("\n 번째 와 마지막요소를 복사하고 제거하여 출력 = =");
		String[] cp = Arrays.copyOfRange(han1,1,han1.length-1);
		System.out.println(Arrays.toString(cp));
	}

}
