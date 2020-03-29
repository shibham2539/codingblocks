package arrays;

public class arrayswap2demo {

	public static void main(String[] args) {
		int[] arr = null;
		arr = new int[5];
		System.out.println(arr);
		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// swap demo 2
		// this swap works as arr in both are of same reference
		// as in fun the arr in heap is changed 
		// so changes in heap is permanent so as main function also it will get swap 
		
		int i = 0;
		int j = 2;
		swap(arr,i,j);
		System.out.println(arr[i] + ", " + arr[j]);
	}

	public static void swap(int[] arr, int i, int j) {
		System.out.println(arr[i] + ", " + arr[j]);
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		System.out.println(arr[i] + " " + arr[j]);

	}

}
