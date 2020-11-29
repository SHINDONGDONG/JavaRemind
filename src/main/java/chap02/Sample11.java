package chap02;

import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String in = sc.next();
//		String in2 = sc.next();
		String in3 = sc.nextLine();
//		String newIn = in.toUpperCase();
//		System.out.printf("입력한 값 : %s\n글자수 : %d\n", in.toUpperCase(), in.length() );
//		System.out.printf("입력한 값 : %s\n글자수 : %d\n", in2.toUpperCase(), in2.length() );
		System.out.printf("입력한 값 : [%s]\n글자수 : %d\n", in3.toUpperCase().trim(), in3.trim().length() );
		
		sc.close();
	}

}
