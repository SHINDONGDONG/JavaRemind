package chap09;

public class Sample02 {

	public static void main(String[] args) {
		
		String color = "노랑";
		String manu = "횬대";
		ElectricCar car2 = new ElectricCar("빨강", "혼다");
 		Car car1 = new GasolinCar(color,manu); //조상클래스
		car1.printInfo();
		car2.setColor("gray");
		car2.printInfo();
	}

}
