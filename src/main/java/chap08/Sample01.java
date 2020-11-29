package chap08;

public class Sample01 {
	
	/*
	 * 필드영역 시작 
	 * 필드영역 끝
	 * */
	public String name= "철수";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Sample01 s = new Sample01();
		
		//public 접근제어자 붕어빵 
		System.out.printf("이름은 : %s \n",s.name);
		s.setName("바보");
		System.out.println(s.getName());
		
		
		
		


}
}