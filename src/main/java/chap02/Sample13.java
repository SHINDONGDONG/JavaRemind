package chap02;

import java.util.HashMap;
import java.util.Map;

import lombok.var;

public class Sample13 {

	public static void main(String[] args) {
//		var i = 365;  //int i = 365;
//		System.out.println(i);
//		var l = 55L;
//		System.out.println(l);
//		Map<String,String> map = new HashMap<String,String>();
//		var map2 = new HashMap<String, String>();
//		System.out.println(map2.toString());
		
		var name ="나어때";
		var age = 28;
		var height = 188.7f;
		System.out.printf("이름 : %s\n나이 : %d\n키 : %f\n",name,age,height);
	
	}

}
