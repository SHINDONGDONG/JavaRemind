package chap05;

public class Sample06 {

	public static void main(String[] args) {
		int[][][] ho = {
				{
					{1,2,3},{4,5,6},{9},{7,9,10},{11,12,13}},
				{
						{14,15,16},{4,5,6},{9},{7,9,10},{11,12,13}
				}	
		};
		
		System.out.printf("1층1동1세대 %d\n",ho[0][0][0]);
		System.out.printf("2층3동1세대 %d\n",ho[1][2][0]);
		System.out.printf("2층1동2세대 %d\n",ho[1][0][1]);

		
	}

}
