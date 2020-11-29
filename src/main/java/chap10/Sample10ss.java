package chap10;

import lombok.Data;

@Data
class Student<G,C>{
	G g;
	C c;
	public void printInfo(String name) {
		System.out.printf("%s은(는) %d 학년 %d반입니다.\n",name,g,c);
	}
	public Student(G g, C c) {
		this.g = g;
		this.c = c;
	}
	
}

public class Sample10ss {
	public static void main(String[] args) {
		Student<Integer,Integer> younghee = new Student<Integer,Integer>(1,4);
		younghee.printInfo("영희");
	}
}
