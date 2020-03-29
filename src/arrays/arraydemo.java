package arrays;

public class arraydemo {

	public static void main(String[] args) {
		int[] arr = null;
		System.out.println(arr);

		// allocate space
		arr = new int[5];
		System.out.println(arr);
		// it prints [I@4aa298b7
		// [ it tells array I tells int type array
		// rest all it is memory address

		// get the values

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		// for better use loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		// enhance for loop
		for (int val : arr) {
			System.out.println(val);
		}

		// array swap 1 which not work

		System.out.println("swap for case 1");
		int i = 0;
		int j = 2;

		swap(arr[i], arr[j]);
		System.out.println(arr[i] + " " + arr[j]);

	}

	public static void swap(int one, int two) {
		int temp;
		temp = one;
		one = two;
		two = temp;

	}

}
