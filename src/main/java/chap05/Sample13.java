package chap05;

import java.util.Arrays;

import lombok.var;

public class Sample13 {

	public static void main(String[] args) {
		var students = new String[] {
				"스노우 화이트","멀린","레지나","에버러지","잭","아더","한스"
		};
		var sortStudents = Arrays.copyOf(students,students.length);
		Arrays.sort(sortStudents);
		
		int idx = Arrays.binarySearch(sortStudents, "스노우 화이트");
		System.out.println(Arrays.toString(sortStudents));
		System.out.printf("%d 번째 [%s]가 위치합니다. \n",(idx + 1),sortStudents[idx]);
	}

}
