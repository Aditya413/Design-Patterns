package com.aditech.DSandAlgo;

public class StackCustom {
	int size;
	int arr[];
	int top;
	
	StackCustom(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public void push(int element){
		if(!isFull()){
			top++;
			arr[top] = element;
			System.out.println("Element is pushed");
		} else{
			System.out.println("Sorry, Stack is Full");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			int popedElement = top;
			top--;
			return arr[popedElement];
		} else {
			System.out.println("Sorry, Stack is already empty");
			return -1;
		}
	}
	
	public int peek(){
		if(!isEmpty()){
			return arr[top];
		} else {
			System.out.println("Sorry, Stack is already empty");
			return -1;
		}
	}
	
	public boolean isFull(){
		return (size-1 == top);
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	// Sort a stack using another stack 
		public static StackCustom sortStack(StackCustom stack)
		{
			StackCustom tempStack = new StackCustom(10);
			while(!stack.isEmpty())
			{
				int currentData=stack.pop();
				while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
					stack.push(tempStack.pop());
				}
				tempStack.push(currentData);
			}
			return tempStack;
		}
	 
		public  void printStack(StackCustom stack)
		{
			if(top>=0)
			{
				System.out.println("Elements of stacks are:");
				for (int i = 0; i <= top; i++) {
					System.out.println(arr[i]);
				}
			}
	 
		}

		public static void main(String[] args) {
			StackCustom stackCustom = new StackCustom(10);
			System.out.println("=================");
			stackCustom.push(10);
			stackCustom.push(30);
			stackCustom.push(50);
			stackCustom.push(40);
			stackCustom.printStack(stackCustom);
			StackCustom sortedStack=sortStack(stackCustom);
			System.out.println("=================");
			System.out.println("After Sorting :");
			System.out.println("=================");
			sortedStack.printStack(sortedStack);
	 
		}
	
}
