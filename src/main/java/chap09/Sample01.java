package chap09;

public class Sample01 {

	public static void main(String[] args) {
		
		String color = "노랑";
		String manu = "횬대";
		ElectricCar car2 = new ElectricCar("빨강", "혼다");
 		GasolinCar car1 = new GasolinCar(color,manu);
		car1.printInfo();
		System.out.println(car1.fillup());
		System.out.println("=========================== ");
		car2.printInfo();
		System.out.println(car2.fillup());
	}

}
