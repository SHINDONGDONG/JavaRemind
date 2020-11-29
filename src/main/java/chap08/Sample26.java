package chap08;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

public class Sample26 {

	public static void main(String[] args) {
//		Person per1 = new Person(123);
//		Person per2 = new Person(2, "very");
	Person per1 = Person.builder()
			.no(1)
			.name("AAAA")
			.phone("2020-2020-1010")
			.build();
		
	}
}
//	@RequiredArgsConstructor
	@Builder
	class Person{
		private final int no;
		private String name;
		private String phone;
		
}
