package arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 900, 600, 500, 300, 200, 43, 533, 333, 40, 43, 2222, 32, 1 };
		bubblesort(array);
		selectionsort(array);
		display(array);
	}

	public static void bubblesort(int[] array) {
 
		for (int counter = 0; counter < array.length - 1; counter++) {

			for (int j = 0; j < array.length - 1 - counter; j++) {

				if (array[j] > array[j + 1]) {
					int temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionsort(int[] array) {

		for (int counter = 0; counter < array.length - 1; counter++) {

			int min = counter;
			for (int j = counter; j < array.length; j++) {
				if (array[j] < array[min]) {
					int temp;
					temp = array[j];
					array[j] = array[min];
					array[min] = temp;
				}
			}
		}
	}

	public static void display(int[] array) {
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}
}
