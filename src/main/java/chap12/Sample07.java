package chap12;

import lombok.Getter;

//메서드를 갖는 열거형 enum
public class Sample07 {

	public static void main(String[] args) {

		CITY returnCity = CITY.valueOf(0);
		System.out.println(returnCity.getDestination());
		System.out.printf("우리들의 도시 %s 은(는) %d번째로 우수한 도시입니다.",CITY.SEOUL.getDestination(),CITY.SEOUL.getSeq()+1);
		
	}

}

@Getter
enum CITY {
	SEOUL("서울",0),DAEJEON("대전",1),DAEGU("대구",2),PUSAN("부산",3),GWANGJU("광주",4);
	private final String destination;
	private final int seq;
	private CITY(String destination,int seq) {
		this.destination = destination;
		this.seq = seq;
	}
	
	public static CITY valueOf(int selectNum) {
		CITY returnCITY = null;
		for(CITY city : CITY.values()) {
			if(city.ordinal() == selectNum) {
				returnCITY = city;
				break;
			}
		}
		return returnCITY;
	}
}