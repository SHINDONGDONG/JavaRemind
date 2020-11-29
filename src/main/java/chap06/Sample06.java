package chap06;

public class Sample06 {

	public static void main(String[] args) {

		for(int i = 2; i < 10; i++) {
			System.out.println("==============="+i+"단===============");
			for(int j =1; j <10; j++) {
				System.out.println(i +"*" + j +" :: " +j*i);
				if(false) {
					continue;
				}
				System.out.println("--------------");
				
			}
		}
		
	}

}
