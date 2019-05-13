package com.pradeep.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= {10,5,6,-9,55,60,-22};
		
		for(int unsortedlastindex=array.length-1;unsortedlastindex>0;unsortedlastindex--) {
			for(int i=0;i<unsortedlastindex;i++) {
				if (array[i]>array[i+1]) {
					swap(array, i, i+1);
				}
			}
		}
		
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		
		

	}
	
	public static void swap(int[]array,int i,int j) {
		if (i==j) {
			return;
		}
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
