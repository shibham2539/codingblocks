package recursion;

public class bubblesortrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 50, 40, 30, 20, 10 };
		int si = 0;
		int li = array.length - 1;
		bubblesort(array, si, li);
		display(array);
	}

	public static void bubblesort(int[] array, int si, int li) {

		if (li == 0) {
			return;
		}
		if (si == li) {
			bubblesort(array, 0, li - 1);
			return; // return means so that aga ka statement execute na ho
		}

		int temp;
		if (array[si] > array[si + 1]) {
			temp = array[si];
			array[si] = array[si + 1];
			array[si + 1] = temp;
		}
		bubblesort(array, si + 1, li);

	}

	public static void display(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}
	}
}
