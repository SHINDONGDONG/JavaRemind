package chap04;

public class Sample14 {

	public static void main(String[] args) {

		int a =60;
		int b =-10;
		
		System.out.println("* >>> 무조건 0으로 채워짐 음수양수");
		
		System.out.printf("[%32s] >>>4 [%32s]%d\n",lPad(Integer.toBinaryString(a), 32, "0"),
																					lPad(Integer.toBinaryString(a >>> 4), 32, "0"),a >>> 0);
		System.out.printf("[%32s] >>>4 [%32s]%d\n",lPad(Integer.toBinaryString(b), 32, "0"),
																					lPad(Integer.toBinaryString(b >>> 4), 32, "0"),b >>> 4);
		
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
