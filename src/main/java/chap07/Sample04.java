package chap07;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in;
		System.out.print("숫자를 입력하세요.");
		
		while(sc.hasNext()) {
			in = sc.nextInt();
			if(in == 0 ) {
				System.out.println("프로그래믕ㄹ 종료합니다");
				break;
			}
			else if(in % 2 ==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("d홀수입니다.");
			}
			System.out.println("숫자를 입려갛세요");
		}

	}

}
