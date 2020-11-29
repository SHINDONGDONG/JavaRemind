package chap08;

import java.util.Arrays;

public class Sample18 {

	//object 배열
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student("빵형", 21, 1);
		students[1] = new Student("빵동생", 23, 2);
		students[2] = new Student("빵친구", 25, 7);
		
		for(Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("==================");
		Arrays.stream(students)
			.forEach(s->System.out.println(s));
//		.forEach(System.out.println());
//		System.out.println("==================");
//		Arrays.stream(students)
	}
	

}
