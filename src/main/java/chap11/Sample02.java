package chap11;

import java.util.ArrayList;
import java.util.List;

public class Sample02 {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("하나");
		arr.add("둘");
		arr.add("셋");
		arr.add("넷");
		arr.add("다섯");
		arr.add(2,"이쩜오");
		arr.set(2, "둘쩜오");
		
		for(String a : arr) {
			System.out.println(a);
		}
	}

}
