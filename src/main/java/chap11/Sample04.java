package chap11;

import java.util.ArrayList;
import java.util.List;

import lombok.var;

public class Sample04 {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("하나");
		arr.add("둘");
		arr.add("셋");
		arr.add("넷");
		arr.add("다섯");
		arr.add(2,"이쩜오");
		arr.set(2, "둘쩜오");
//		arr.remove(2);
		for(int i=0; i<arr.size(); i++) {
			System.out.printf("%d번 - %s\n",i+1,arr.get(i));
		}
		System.out.println("=====================");

	}

}
