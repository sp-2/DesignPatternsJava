package strategy;

import utilities.*;

public class SelectionSort implements Sort{

	@Override
	public void sort(int[] arr) {
		System.out.println("Sorting Strategy: Selection Sort");
		selectionSort(arr);
	}
	
	public static void selectionSort(int[] items) {
		
		for(int i=0; i < items.length-1; i++) {
			int minIdx = i;
			
			for(int j=i+1; j < items.length; j++) {
				if(items[j] < items[minIdx]) {
					minIdx = j;
				}
			}
			
			if(minIdx!=i) {Swap.swap(items, i, minIdx);}
		}
	}

	public static void main(String[] args) {
		Sort b = new SelectionSort();
		int[] arr = {8, 7, 6, 6, 6, 5, -1, 11, -11, -2, 2, 2, 1};
		b.sort(arr);
		Print.print(arr);
	}
}