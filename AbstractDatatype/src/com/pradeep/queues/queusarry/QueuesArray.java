package com.pradeep.queues.queusarry;

import java.util.NoSuchElementException;

public class QueuesArray {
	
	private Employee[] queus;
	private int front;
	private int back;
	
	
	public QueuesArray(int capacity ) {
		queus= new Employee[capacity];
	}
	
	
	public void add(Employee employee) {
		
		if(back == queus.length) {
			Employee[] newArray= new Employee[2*queus.length];
			System.arraycopy(queus, 0, newArray, 0, queus.length);
			queus=newArray;
		}
		
		queus[back]=employee;
		back++;
		
	}
	
	public Employee remove() {
		if(size()==0) {
			throw new NoSuchElementException();
		}
		
		Employee employee=queus[front];
		queus[front]=null;
		front++;
		
		
		if(size()==0) {
			front=0;
			back=0;
		}
		return employee;
	}
	
	public Employee peek() {
		return queus[front];
	}
	
	public int size() {
		return back-front;
	}
     
	public void printQueus() {
		for (int i=front;i<back;i++) {
			System.out.println(queus[i]);
		}
	}
}
