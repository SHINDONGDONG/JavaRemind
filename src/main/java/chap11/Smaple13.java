package chap11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//해쉬맵
public class Smaple13 {

	public static void main(String[] args) {

		//학번정보
		//해쉬매븡ㄴ 정렬되지않은 밸류형태로 저장
		Map<String,String> hashMap = new HashMap<>();
		hashMap.put("1902893", "선풍기");
		hashMap.put("1929334", "냉장고");
		hashMap.put("5852192", "신문지");
		hashMap.put("4675643", "고무신");
		hashMap.put("0099373", "솔가발");
		System.out.println(hashMap);
		System.out.println("\n");
		
		System.out.println("트리맵 은 정렬하며 key value형태로 저장합니다. ");
		TreeMap<String,String> map = new TreeMap<String, String>();
		map.putAll(hashMap); //해쉬맵을 복사해서 전부 넣는다.
		System.out.println(map);
		
		System.out.println("학번이 1800000보다 크거나  가장 가까운 학번을 찾는다.");
		System.out.println(map.ceilingEntry("0099223"));  //키 벨류
		System.out.println(map.get(map.ceilingKey("0099223")));  //벨류
		
	}

}
