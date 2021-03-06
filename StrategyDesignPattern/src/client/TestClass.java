package client;

import strategy.*;

/* The Strategy Pattern:
 * Defines a family of algorithms, encapsulates each one, and then makes them interchangeable.
 * Strategy lets the algorithms vary independently from the clients that use it.
 * This behavioral software design pattern lets you decide/defer which algorithm to use at runtime.
 */

public class TestClass {
	public static void main(String[] args) {

		int[] arr1 = {8, 7, 6, 6, 6, 5, -1, 11, -11, -2, 2, 2, 1};
		int[] arr2 = {88, 27, 16, 61, 60, 5, -41, 11, -11, -22, 32, 42, 51};
		int[] arr3 = {508, 707, 61, 76, 6, 5, -1, 101, -101, -2, 27, 2, 11};
		
		Sort qsl = new QuickSortLomuto();
		Sort ms  = new MergeSort();
		Sort ss  = new SelectionSort();
		
		//pass sorting strategy to the constructor
		DataSorter dsA = new DataSorterA(qsl);
		
		DataSorter dsB = new DataSorterB(ms);
			
		dsA.setData(arr1);
		dsA.printData();
		dsA.sortData();
		dsA.printData();
		System.out.println("---------");
		
		dsB.setData(arr2);
		dsB.printData();
		dsB.sortData();
		dsB.printData();
		System.out.println("---------");
		dsA.setData(arr3);
		dsA.printData();
		
		//change sorting strategy
		dsA.setSortStrategy(ss);
		dsA.sortData();
		dsA.printData();
		System.out.println("---------");
	}
}
/* Output
Printing Data:
8 7 6 6 6 5 -1 11 -11 -2 2 2 1 

Sorting Strategy: Quick Sort Lomuto
Printing Data:
-11 -2 -1 1 2 2 5 6 6 6 7 8 11 

---------
Printing Data:
88 27 16 61 60 5 -41 11 -11 -22 32 42 51 

Sorting Strategy: Merge Sort
Printing Data:
-41 -22 -11 5 11 16 27 32 42 51 60 61 88 

---------
Printing Data:
508 707 61 76 6 5 -1 101 -101 -2 27 2 11 

Sorting Strategy: Selection Sort
Printing Data:
-101 -2 -1 2 5 6 11 27 61 76 101 508 707 

---------


*/