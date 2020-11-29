package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import lombok.var;

public class Sample14 {

	public static void main(String[] args) {
		//배열에서 데이터 추가하는 방법
		var student1 = new String[7];
		student1[0] = "스노우 화이트";
		student1[1] = "멀린";
		student1[2] = "레지나";
		student1[3] = "에버리지";
		student1[4] = "잭";
		student1[5] = "아더";
		student1[6] = "한스";
		
		var student2 = new String[] {
				"스노우 화이트","멀린","레지나","에버러지","잭","아더","한스"
		};
		
		List<String> student3 = new ArrayList<String>();
		student3.add("스노우화이트");
		
		List<String> student4 = Arrays.asList("스노우 화이트","멀린","레지나","에버러지","잭","아더","한스");
		
		System.out.println(Arrays.toString(student1));
		System.out.println(Arrays.toString(student2));
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		
		
	}

}
