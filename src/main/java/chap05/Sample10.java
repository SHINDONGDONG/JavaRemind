package chap05;

import java.util.Arrays;

public class Sample10 {

	public static void main(String[] args) {

		int[] co = {1,2,3,4,5,6}; //만점자.
		int[][] an = {
				{1,2,3,4,5,5},
				{1,1,1,2,3,4},
				{2,2,3,4,5,1},
				{1,2,3,4,5,6}
		};
		
		//만점자 찾기
		int no = 0;
		for(int[] ans:an ) {
			no++;
			if(Arrays.equals(co, ans)) {
				System.out.printf("%d번 학생 만점자입니다.\n",no);
			}else {
				System.out.printf("%d번 학생은 만점자가 아닙니다.\n",no);
			}
		}
		
	}

}
