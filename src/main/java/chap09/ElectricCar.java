package chap09;

import lombok.AllArgsConstructor;

public class ElectricCar extends Car{

	public ElectricCar(String color, String manu) {
		super(color, manu);
	}

	@Override
	public String fillup() {
		return "전기를 충전합니다";
	}

	//자료형으로 쓰는 추상클래스
	public void setColor(String color ) {
		this.color = color;
	}
	
	
	//
//	private String color;
//	private String manu;
//	
//	public void printInfo() {
//		System.out.println("이차의 색  : " + this.color);
//		System.out.println("이차는   : " + fillup());
//		System.out.println("이차는  : " + this.manu + "에서 생산합니다.");
//	}
//	public String fillup() {
//		return "전기를 충전하다";
//	}
}
