package strategy;

import utilities.*;

public class QuickSortHoare implements Sort{
	
	@Override
	public void sort(int[] arr) {
		System.out.println("Sorting Strategy: Quick Sort Hoare");
		quickSortHoare(arr);
	}
	
	public static void quickSortHoare(int[] items) {
		quickSortHoareH(items, 0, items.length-1);
	}
	
	public static void quickSortHoareH(int[] items, int start, int end) {
		if(start>=end) {return;}
		
		int pivot = partitionHoare(items, start, end);
		quickSortHoareH(items, start, pivot);
		quickSortHoareH(items, pivot+1, end);
	}
	
	public static int partitionHoare(int[] items, int start, int end) {
			
			int pivotIndex = start + (end-start)/2;
			int pivot      = items[pivotIndex];
			int i          = start;
			int j          = end;

			while(true) {
				while(items[i] < pivot) {i++;}
				while(items[j] > pivot) {j--;}	
				
				if(i >= j) {
					return j;
				}
				
				Swap.swap(items, i++, j--);
			}
		}
	
	public static void main(String[] args) {
		Sort b = new QuickSortHoare();
		int[] arr = {8, 7, 6, 6, 6, 5, -1, 11, -11, 3, 2, 2, 1};
		b.sort(arr);
		Print.print(arr);
	}
}
