package arrays;

public class arrayswapdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = null;
		System.out.println(arr);

		// allocate space
		arr = new int[5];
		System.out.println(arr);
		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		// swap demo 3
		// this will not work
		int[] other = { 100, 200, 300 };
		System.out.println(arr[0] + ", " + other[0]);

		swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);
	}

	public static void swap(int[] i, int[] j) {

		int[] temp = i;
		i = j;
		j = temp;
	}

}
