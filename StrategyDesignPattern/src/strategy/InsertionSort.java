package strategy;

import utilities.Print;

public class InsertionSort implements Sort{
	
	@Override
	public void sort(int[] arr) {
		System.out.println("Sorting Strategy: Insertion Sort");
		insertionSort(arr);
	}
	
	public static void insertionSort(int[] items) {
		
		for(int i=0; i < items.length; i++) {
			int cur = items[i];
			int idx = i;
			for(int j=i; j > 0; j--) {
				if(items[j-1] > cur) {
					items[j] = items[j-1];
					idx = j-1;
				} else {
					break;
				}
			}
			items[idx] = cur;
		}
	}
		
	public static void main(String[] args) {
		
		Sort b = new InsertionSort();
		int[] arr = {8, 7, 6, 6, 6, 5, -1, 11, -11, -2, 2, 2, 1};
		b.sort(arr);
		Print.print(arr);
	}
}
