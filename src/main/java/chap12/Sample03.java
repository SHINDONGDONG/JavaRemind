package chap12;

public class Sample03 {

	public static void main(String[] args) {
		Color1 inputColor = Color1.RED;
		System.out.println(inputColor.equals(Color1.RED)? "RED" : "Not red");
		System.out.println(inputColor.equals(Size1.SMALL)? "RED" : "Not red");
	}

}

enum Color1{
	RED,BLUE,ORANGE;
}
enum Size1{
	SMALL,MIDIUM,LARGE;
}
