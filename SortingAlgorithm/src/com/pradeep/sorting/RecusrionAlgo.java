package com.pradeep.sorting;

public class RecusrionAlgo {
	
	public static void main(String[] args) {
		System.out.println(iterativeMethod(3));
		System.out.println(recursiveMethod(3));
		
	}
	
	public static int recursiveMethod(int num) {
		if (num ==0) {
			return 1;
		}
		return num * recursiveMethod(num-1);
	}
	
	public static int iterativeMethod(int num) {
		if(num==0) {
			return 1;
		}
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		return factorial;
	}

}
