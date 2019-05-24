package com.pradeep.queues.queusarry;



public class Main {

	public static void main(String[] args) {
		Employee pradeep=new Employee(1, "Pradeep", "Yadav");
		Employee sandeep=new Employee(2, "Sandeep", "yadav");
		Employee jack=new Employee(3, "jack", "done");
		Employee mark=new Employee(4, "Mark", "wilsom");
		
		QueuesArray queus= new QueuesArray(10);
		queus.add(pradeep);
		queus.add(sandeep);
		queus.add(jack);
		queus.add(mark);
		
		//queus.printQueus();
		
		queus.remove();
		queus.add(pradeep);
		
		//queus.printQueus();
	
		
		System.out.println(queus.peek());
		
	}

}
