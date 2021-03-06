package strategy;

import utilities.*;

public class QuickSortLomuto implements Sort{
	
	@Override
	public void sort(int[] arr) {
		System.out.println("Sorting Strategy: Quick Sort Lomuto");
		quickSortLomuto(arr);
	}
	
	
	public static void quickSortLomuto(int[] items) {
		quickSortLomutoH(items, 0, items.length-1);
	}
	
	public static void quickSortLomutoH(int[] items, int start, int end) {
	
		if(start >= end) {return;}
		
		int pivot = partitionLomuto(items, start, end);
	
		quickSortLomutoH(items, start, pivot-1);
		quickSortLomutoH(items, pivot+1, end);
	
	}
	
	public static int partitionLomuto(int[] items, int start, int end) {
			
			int pivot = items[end];
			int i     = start;
					
			for(int j=start; j<end; j++) {
				if(items[j] < pivot){Swap.swap(items, i, j); i++;}			
			}
			
			Swap.swap(items, i, end);
			
			return i;
		}
	
	public static void main(String[] args) {
		Sort b = new QuickSortLomuto();
		int[] arr = {8, 7, 6, 6, 6, 5, -1, 11, -11, -2, 2, 2, 1};
		b.sort(arr);
		Print.print(arr);
	}
}