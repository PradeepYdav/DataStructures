package com.pradeep.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {20,35,-15,7,55,1,-22};
		
		for (int firstunsortedindex=1;firstunsortedindex<array.length;firstunsortedindex++) {
			
			int newelement=array[firstunsortedindex];
			
			int i;
			
			for(i=firstunsortedindex;i>0 && array[i -1]>newelement;i--) {
				array[i]=array[i-1];
			}
			
			array[i]= newelement;
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		

	}

}
