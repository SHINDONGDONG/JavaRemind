package chap10;


//컴퓨터 내장부품
class CoputerPart {}
//그래픽카드
class Graphics extends CoputerPart{}
//메모리
class Memory extends CoputerPart{	}
//모니터
class Monnitor{}

class Computer<T extends CoputerPart>{
	 private T compo;
	 public Computer(T compo) {
		this.compo = compo;
	}
	public void toInfo() {
		 System.out.println(compo.getClass().getName());
	 }
	public Computer() {
	}
	/**
	 * @param compo セットする compo
	 */
	public void setCompo(T compo) {
		this.compo = compo;
	}
	
	
}
	


public class Sample08 {

	public static void main(String[] args) {
		Computer<CoputerPart> vga = new Computer<CoputerPart>();
		vga.setCompo(new Graphics());
		vga.toInfo();
		Computer<CoputerPart> mem = new Computer<>();
		mem.setCompo(new Memory());
		mem.toInfo();
		
	}

}
