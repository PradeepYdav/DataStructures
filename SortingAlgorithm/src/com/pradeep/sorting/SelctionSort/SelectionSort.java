package com.pradeep.sorting.SelctionSort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {20,35,-15,7,55,1,-22};
		
		// complexity o(n2)quadratic
		for(int lastunsortedindex=array.length-1;lastunsortedindex>0;lastunsortedindex--) {
			int largest=0;
			for(int i=1;i<=lastunsortedindex;i++) {
				if (array[i]>array[largest]) {
					largest=i;
				}
			
			}
			swap(array,largest,lastunsortedindex);
		}
		
		for(int i=0;i<array.length;i++) {
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
