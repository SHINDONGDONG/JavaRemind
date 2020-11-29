package chap10;

public class Sample07ss {

	public static void main(String[] args) {
		Sample06ss<Integer> age = new Sample06ss<>();
		Sample06ss<String> name = new Sample06ss<>();

		age.setT(18);
		name.setT("빵형");
		int personAge = (int)age.getT();
		String personName = (String)name.getT();
		System.out.printf("%s 는 %d 살이다.", personName, personAge);
	}

}
