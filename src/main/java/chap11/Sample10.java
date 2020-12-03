package chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import lombok.var;

//hashset 중복을 저절로 .... 쉽사기..

public class Sample10 {

	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("dog");
		list.add("dog");
		list.add("cat");
		list.add("cat");
		list.add("lion");
		list.add("lion");
		
		System.out.println(list);
		var ha = new HashSet<String>();
		ha.addAll(list);
		
		System.out.println(ha);
		ha.add("tiger");
		System.out.println(ha);
		ha.forEach(x -> System.out.println(x));
		ha.forEach(System.out::println);
		System.out.println();
		ha.iterator().forEachRemaining(System.out::println);
		System.out.println();
		System.out.printf("cat이 존재 하나요? %s",ha.contains("cat"));
		
	}

}

