package chap09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
	protected String color;
	protected String manu;
	
	
	public void printInfo() {
		System.out.println("이차의 색  : " + this.color);
		System.out.println("이차는   : " + fillup());
		System.out.println("이차는  : " + this.manu + "에서 생산합니다.");
	}
	public abstract String fillup();
	
}
