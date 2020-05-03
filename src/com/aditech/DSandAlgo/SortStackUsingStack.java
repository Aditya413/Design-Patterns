package com.aditech.DSandAlgo;

public class SortStackUsingStack {

	public static void main(String[] args) {
		StackCustom stack = new StackCustom(10);
		stack.push(19);
		stack.push(1);
		stack.push(9);
		stack.push(20);
		stack.push(5);
		
		StackCustom tempStack = new StackCustom(10);
		
		while(!stack.isEmpty()){
			int poppedElement = stack.pop();
			while(!tempStack.isEmpty() && tempStack.peek()>poppedElement){
				stack.push(tempStack.peek());
			}
			tempStack.push(poppedElement);
		}
		
		for(int i=0; i<5; i++){
			System.out.println(tempStack.pop());
		}
	}

}
