package chap09.Smaple04;

public class Cat extends Pet{

	String name = "고양이";
	
	public Cat(boolean wing, int legCount) {
		super(wing, legCount);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void run(String name) {
		System.out.printf("%s 소리없이 조용히 뜁니다\n",name);
	}

}
