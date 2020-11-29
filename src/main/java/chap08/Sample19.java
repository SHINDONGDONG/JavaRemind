package chap08;

public class Sample19 {

	public static void main(String[] args) {
		
		//내지갑에 만원이있음
		Wallet myWallet = new Wallet(10000);
		//2천원짜리 물품을 지급햇음 세금 10퍼까지 2200원 지급
//		myWallet.myMoney -= 2200;
		//내지갑에 7800원이 있는지 확인
		myWallet.chkMyMoney();
		myWallet.pay(2000);
		myWallet.chkMyMoney();
	}

}

class Wallet{
	int myMoney;
	public Wallet(int Money) {
		this.myMoney = Money;
	}
	public void chkMyMoney() {
		System.out.println("남은돈 : " + this.myMoney);
	}
	public void pay(int payMoney) {
		this.myMoney -= (int)(payMoney * 1.1);
	}
}
