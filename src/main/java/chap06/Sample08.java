package chap06;

import java.util.Arrays;

public class Sample08 {

	public static void main(String[] args) {
		String[] friends = {"둘리","철수","다비드"};
		
		System.out.println("----------------------");
		for(String friend : friends) {
			System.out.println(friend);
		}
		System.out.println("----------------------");
		Arrays.stream(friends).forEach(friend -> {
		System.out.println(friend);
		});
		System.out.println("----------------------");
		Arrays.stream(friends)
		.forEach(System.out::println);
	}

}
