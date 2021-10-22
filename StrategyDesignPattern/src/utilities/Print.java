package utilities;

public interface Print {
	public static void print(int[] arr) {
		System.out.println("Printing Data:");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
	}
}
