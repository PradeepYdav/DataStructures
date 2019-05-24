package com.pradeep.stack.linkedstack;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee pradeep=new Employee(1, "Pradeep", "Yadav");
		Employee sandeep=new Employee(2, "Sandeep", "yadav");
		Employee jack=new Employee(3, "jack", "done");
		Employee mark=new Employee(4, "Mark", "wilsom");
		
		LinkedStack linkedStack= new LinkedStack();
		linkedStack.push(pradeep);
		linkedStack.push(sandeep);
		linkedStack.push(jack);
		linkedStack.push(mark);
		
		
//		linkedStack.printStack();
		
		//System.out.println(linkedStack.peek());
		System.out.println(linkedStack.pop());
		linkedStack.printStack();
		
		

	}

}
