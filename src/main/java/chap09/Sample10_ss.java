package chap09;

import java.util.UUID;
import java.util.stream.Stream;

public class Sample10_ss {

	public static void main(String[] args) {

		String legacyKey = LegacyUtil.getRandom();
		System.out.printf("regacyKey 시스템에서 처리될 키값은 %s입니다.\n\n",legacyKey);
		for(int i=0; i<5; i++) {
			String key = NewUtil.getRandom();
			System.out.printf("새로운 시스템에서 처리될 키값은 %s 입니다 \n\n",key);
		}
		System.out.println("=======================================");
		Stream.generate(UUID::randomUUID)
			.limit(5)
//			.forEach(System.out::println);
			.forEach( x -> System.out.printf("더 새로운 시스템에서 처리될 키값은 %s 입니다 \n\n",x));
	}
}

class LegacyUtil {
	public static String getRandom() {
		return ""+(int)(Math.random()*10+1);
	}
}
class NewUtil extends LegacyUtil {
	public static String getRandom() {  //랜덤 유유ㅏㅇ이디
		return ""+UUID.randomUUID();
	}
}
