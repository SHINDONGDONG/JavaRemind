package chap05;

public class Sample05 {

	public static void main(String[] args) {
		
		int[][] hol = new int[5][3];
		hol[1] = new int[1];
		
		System.out.printf("1층 세대 %d \n",hol[0].length);
		System.out.printf("2층 세대 %d \n",hol[1].length);
		System.out.printf("3층 세대 %d \n",hol[2].length);
		System.out.printf("4층 세대 %d \n",hol[3].length);
		System.out.printf("5층 세대 %d \n",hol[4].length);

	}

}
