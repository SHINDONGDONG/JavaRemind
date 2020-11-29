package chap09;

import lombok.AllArgsConstructor;

public class GasolinCar extends Car {
	
	
	public GasolinCar(String color, String manu) {
		super(color, manu);
	}

	@Override
	public String fillup() {
		return "휘발유를 충전하빈다";
	}
	
//	public void printInfo() {
//		System.out.println("이차의 색  : " + this.color);
//		System.out.println("이차는   : " + fillup());
//		System.out.println("이차는  : " + this.manu + "에서 생산합니다.");
//	}
//	public String fillup() {
//		return "휘발유를 충전합니다.";
//	}
}
