package chap06;

public class Sample03 {

	public static void main(String[] args) {
		String str = "Hello java";
		
		char[] chr = str.toCharArray();
		System.out.println(chr.length);
		System.out.println(chr[0]);
		for(int i=0; i < chr.length; i++) {
			System.out.print(chr[i]);
		}
		
		
	}

}
