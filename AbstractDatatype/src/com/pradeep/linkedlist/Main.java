package com.pradeep.linkedlist;



public class Main {

	public static void main(String[] args) {
		
		Employee pradeep=new Employee(1, "Pradeep", "Yadav");
		Employee sandeep=new Employee(2, "Sandeep", "yadav");
		Employee jack=new Employee(3, "jack", "done");
		Employee mark=new Employee(4, "Mark", "wilsom");
		
		
		
		EmployeeLinkedList list= new EmployeeLinkedList();
		
		System.out.println(list.isEmpty());
		list.addToFront(pradeep);
		list.addToFront(sandeep);
		list.addToFront(jack);
		list.addToFront(mark);
		
		System.out.println(list.getSize());
		
		System.out.println(list.isEmpty());
		
		list.printList();
		
		list.removeFromFront();
		System.out.println("\n"+list.getSize());
		
		list.printList();
		
		
	}

}
