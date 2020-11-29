package chap05;

public class Sample04 {

	public static void main(String[] args) {

		String[] str1 = new String[3];
		str1[0] = "자바";
		str1[1] = "코틀린";
		str1[2] = "씨";
		
		System.out.printf("str1배열의 개수는 %s 개입니다.\n",str1.length);
		
		String[] str2 = str1.clone();
		System.out.println("str2 : "+str2[0]);
		System.out.println("str2 : "+str2[1]);
		System.out.println("str2 : "+str2[2]);
	}

}
