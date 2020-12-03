package chap11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import lombok.var;

public class Sample07sssssssssssssssssssssssssssssssss {

	public static void main(String[] args) {

		//순차정렬
		var list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("lion");
		
		System.out.println("1번 forEach");
		list.forEach(s -> System.out.println(s));
		
		System.out.println("2번 for문");
		for(int i=0; i<list.size(); i++) System.out.println(list.get(i));
			
		System.out.println("3번 향상된 for문");
		for(String x : list) System.out.println(x);
		
		System.out.println("4번 Iterator");
		Iterator iter = list.listIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
//			iter.remove();
		}
		System.out.println(list.toString()+" - " + list.size());
		System.out.println("5번 람다식");
		Iterator iter2 = list.listIterator();		
		iter2.forEachRemaining(x ->System.out.println(x));
		
		System.out.println("6번 컨슈머(참조메소드)");
		Iterator iter3 = list.listIterator();		
		iter3.forEachRemaining(System.out::println); 

		
		//sort
		System.out.println("7번 order");
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.toString());
	}

}
