package chap09.Smaple04;

public class Parrot extends Pet{

	public Parrot(boolean wing, int legCount) {
		super(wing, legCount);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void run(String name) {
		System.out.printf("%s 두발로 뜁니다.\n",name);
	}
	
	
	public void fly(String name) {
		System.out.printf("%s 뛰지않고 날라갑니다.\n",name);
	}

}
