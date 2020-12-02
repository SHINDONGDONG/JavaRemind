package chap10;

public class Sample14 {

	public static void main(String[] args) {
//와일드카드.
		Wallet myWallet = new Wallet();
		Money<Integer> m1 = new Money();
		m1.getMoney(10000);

		Money<Integer> m2 = new Money();
		m1.getMoney(600000);
		
		myWallet.insertMoney(m1);
		myWallet.insertMoney(m2);
		System.out.println(myWallet.totalMoney);
		
	}
}

class Wallet{
	double totalMoney = 0;
	public void insertMoney(Money<?> myMoney) {
		totalMoney += myMoney.getMyMoney();
	}
	
	
}

class Money<E extends Number>{
	 double myMoney;

	/**
	 * @return myMoney
	 */
	public double getMyMoney() {
		return myMoney;
	}
	
	public void getMoney(E info) {
		this.myMoney = info.doubleValue(); //더블타입으로 반환되어 들어감
	}
	 
}