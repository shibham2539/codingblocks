package arrays;

public class sortplusselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 900, 600, 500, 300, 200, 43, 533, 333, 40, 43, 2222, 32, 1000 };

		bubblesort(array);
		display(array);
		int mid = BinarySearch(array, 2222);
		System.out.println(mid);
	}
	

	public static void bubblesort(int[] array) {

		for (int counter = 0; counter < array.length-1; counter++) {

			for (int j = 0; j < array.length - 1 - counter; j++) {
				
				if (array[j] > array[j + 1]) {
					int temp;
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public static void display(int[] array) {
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}
	public static int BinarySearch(int[] array, int item) {
		System.out.println("binary search");
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < item) {
				low = mid + 1;
			} else if (array[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
