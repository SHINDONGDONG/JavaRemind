package chap12;

public class Sample04 {

	public static void main(String[] args) {
		System.out.printf("허수아비가 %s의 %s티를 입고있습니다,\n", Size2.LARGE, Color2.RED);
		System.out.println("허수아비가 LARGE의 RED티를 입고있습니다,");
	}

}

//색집합
enum Color2 {
	RED {
		@Override
		public String toString() {
			return "빨강색";
		}
	},
	BLUE{
		@Override
		public String toString() {
			return "파랑색";
		}
	}, ORANGE{
		@Override
		public String toString() {
			return "오랜지색";
		}
	}
}

enum Size2 {
	SMALL{
		@Override
		public String toString() {
			return "가장작은";
		}
	}, 
	MEDIUM{
		@Override
		public String toString() {
			return "중간의";
		}
	}, 
	LARGE{
		@Override
		public String toString() {
			return "제일큰";
		}
		
	}
}