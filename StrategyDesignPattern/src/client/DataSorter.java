package client;

import strategy.Sort;
import utilities.Print;

//client uses sorting algorithms interchangeably
public abstract class DataSorter {
	Sort sort;
	int[] data;
	
	public DataSorter(Sort sort) {
		this.sort = sort;
	}
	
	public void setSortStrategy(Sort sort) {
		this.sort = sort;
	}
	
	public void setData(int[] data) {
		this.data = data;
	}
	
	public void sortData() {
		sort.sort(data);
	}
	
	public void printData() {
		Print.print(data);
	}
}