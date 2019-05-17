package com.pradeep.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {20,35,-15,7,55,1,-22};


		quickSort(intArray,0,intArray.length);

		for (int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		

	}
	
	public  static void quickSort(int [] input , int start,int end){
		if(end -start <2){
			return;
		}

		int pivotindex=partion(input,start,end);
		quickSort(input,start,pivotindex);
		quickSort(input,pivotindex+1,end);

	}

	public static int partion(int[] input,int start,int end){

		int pivot=input[start];
		int i=start;
		int j= end;

		while (i<j){
			//Note Empt array
			while (i<j && input[--j]>=pivot);
			if(i<j){
				input[i]=input[j];
			}

			while (i<j && input[++i]<=pivot);
			if(i<j){
				input[j]=input[i];
			}
		}
		input[j]=pivot;
		return j;
	}

}
