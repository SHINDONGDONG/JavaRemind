package chap12;

import java.awt.Color;

public class Sample02 {

	public static void main(String[] args) {
		Color inputColor = Color.RED;
		System.out.println(inputColor.equals(Color.RED) ? "Red " : "Not Red");
		System.out.println(inputColor.equals(Size.SMALL) ? "Red " : "Not Red");
		
	}
}

class Color {
	final static Color RED  = new Color();
	final static Color BLUE  = new Color();
	final static Color ORANGE  = new Color();
}

//크기집합
class Size {
	final static Size SMALL  = new Size();
	final static Size MIDIUM = new Size();
	final static Size LARGE  = new Size();
}