package com.pradeep.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayStack arrayStack = new ArrayStack(4);
		
		System.out.println(arrayStack.size());
		arrayStack.push(new Employee(1, "pradeep", "yadav"));
		arrayStack.push(new Employee(2, "sandeep", "yadav"));
		arrayStack.push(new Employee(3, "jack", "martin"));
		arrayStack.push(new Employee(4, "jack", "martin"));
		arrayStack.push(new Employee(6, "jack", "martin"));
		
		System.out.println(arrayStack.peek());
		
		System.out.println(arrayStack.size());
		arrayStack.printArray();
		arrayStack.pop();
		System.out.println("--------------------");
		System.out.println(arrayStack.size());
		arrayStack.printArray();
		System.out.println("--------------------");
		arrayStack.pop();
		arrayStack.printArray();
		
		System.out.println("--------------------");
		arrayStack.pop();
		arrayStack.printArray();
		
		System.out.println("--------------------");
		arrayStack.pop();
		arrayStack.printArray();
		
		

	}

}
