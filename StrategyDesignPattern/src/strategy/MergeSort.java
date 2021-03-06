package strategy;

import utilities.Print;

public class MergeSort implements Sort{
	
	@Override
	public void sort(int[] arr) {
		System.out.println("Sorting Strategy: Merge Sort");
		mergeSort(arr);
	}
	
	public static void mergeSort(int[] items) {
		mergeSortH(items, 0, items.length-1);
	}
	
	public static void mergeSortH(int[] arr, int start, int end) {
		if(start>=end) {return;}
		
		int mid = (start+end)/2;
		
		mergeSortH(arr, start, mid);
		mergeSortH(arr, mid+1, end);
		
		merge(arr, start, end, mid);
	}

	public static void merge(int[] arr, int start, int end, int mid) {
		int[] result = new int[end - start +1];
	
		for(int i=0, lIndex=start, rIndex=mid+1 ; i<result.length; i++) {
			if(lIndex>mid) {
				result[i] = arr[rIndex++];
			} else if(rIndex>end) {
				result[i] = arr[lIndex++];
			} else if(arr[lIndex]<arr[rIndex]) {
				result[i] = arr[lIndex++];
			} else {
				result[i] = arr[rIndex++];
			}
		}
		
		for(int i=start, r=0; i<=end;i++, r++) {
			arr[i] = result[r];
		}
				
	}
	
	public static void main(String[] args) {
		Sort b = new MergeSort();
		int[] arr = {8, 7, 6, 6, 6, 5, -1, 11, -11, -2, 2, 2, 1};
		b.sort(arr);
		Print.print(arr);
	}
}
