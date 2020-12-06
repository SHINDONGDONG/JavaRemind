package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//맵 ~
public class Sample12 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		int idx=0;
		map.put("Java",      ++idx);
		map.put("C",           ++idx);
		map.put("C++",       ++idx);
		map.put("Python", ++idx);
		map.put("JS",         ++idx);
		
		Set<String> keys = map.keySet();
		System.out.printf("총 %d개의 맵 엔트리가 있습니다. ",keys.size());
		
		//향상된포문
		for(String key : keys) {
			for(String str : map.keySet()) {
//				System.out.println(str.get);
		}
		
		System.out.println("===========Lamda============");
//		keys.forEach(key -> System.out.println(key));

		System.out.println("===========vlaue============");
			
		}
		
		
	}

}
