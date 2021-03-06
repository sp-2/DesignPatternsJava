package strategy;

import utilities.*;

public class BubbleSort implements Sort{

	@Override
	public void sort(int[] arr) {
		System.out.println("Sorting Strategy: Bubble Sort");
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] items) {
		
		int len = items.length - 1;
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted=true;
			for(int j=0; j < len ; j++) { 
				if(items[j] > items[j+1]) {
					Swap.swap(items, j, j+1);
					isSorted=false;
				}
			}
			len--;
		}
	}

	public static void main(String[] args) {
		Sort b = new BubbleSort();
		int[] arr = {8, 7, 6, 6, 6, 5, -1, 11, -11, -2, 2, 2, 1};
		b.sort(arr);
		Print.print(arr);
	}
}
