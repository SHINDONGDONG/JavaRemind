package chap11;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import lombok.var;

//TreeSet 2진트리 중복제거 정렬 (정렬된 자료형)
public class Sample11 {

	public static void main(String[] args) {
		List<String> arr= new ArrayList<String>();

		arr.add("사자");
		arr.add("사자");
		arr.add("호랑이");
		arr.add("원숭이");
		System.out.println(arr);
		System.out.println("1 > arraylist를 treeset으로 가져옵니다.");
		var trs = new TreeSet();
		trs.addAll(arr);
		System.out.println(trs);
		trs.add("기린");
		System.out.println(trs);
		if(!trs.contains("토끼")) {
			System.out.println("trs에 토끼가 없으므로 추가합니다.");
			trs.add("토끼");
		}
		System.out.println(trs);
		
		//제시어에 제일 가까운값 찾기(동일하면 동일한값 출력).(큰것)(한글영어)
		System.out.println(trs.ceiling("툐"));
		//위의 반대 작은값
		System.out.println(trs.floor("툐"));
		
	}

}
