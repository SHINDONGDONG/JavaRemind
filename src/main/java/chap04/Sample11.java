package chap04;

public class Sample11 {

	public static void main(String[] args) {

		int a =60;
		int b =-10;
		System.out.println(" * NOT");
		System.out.printf("[%32s]  ~ [%32s] = %d ~ %d \n", lPad(Integer.toBinaryString(a), 32, "0"),
																									lPad(Integer.toBinaryString(~a), 32, "0"),a,~a);
		System.out.println("===============================");
		System.out.printf("[%32s]  ~ [%32s] = %d ~ %d \n", lPad(Integer.toBinaryString(b), 32, "0"),
				lPad(Integer.toBinaryString(~b), 32, "0"),b,~b);
		System.out.println("===============================");
//		System.out.printf("[%32s] %d%n", lPad(Integer.toBinaryString(a ~ b), 32, "0"), a ~ b);
	}

	public static String lPad(String context, int len, String ch) {
		String str = context;
		if (context.length() < len) {
			for (int i = 0; i < len - context.length(); i++) {
				str = ch + str;
			}
		}
		return str;
	}
	
}
