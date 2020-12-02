package chap11;

import java.util.Stack;

import lombok.var;

public class Sample06ssssssssssssssssss {

	public static void main(String[] args) {
		//stack push pop!!!!
		var stack = new Stack<String>();
		stack.push("dog");
		stack.push("cat");
		stack.push("lion");
		
		System.out.printf("총 %d의 자료가 있습니다.\n",stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.printf("총 %d의 자료가 있습니다.",stack.size());
		
	}

}
