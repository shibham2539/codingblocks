package arrays;

public class arrmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 100, 200, 300, 230, 400, 3, 22, 332, 43 };
		int[] array2 = { 10, 20, 50, 145, 225, 336, 500, 4588, 9995, 10000 };
		int[] array3 = { 2, 3, 4, 3, 3, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
				3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5 };
		int item = 22;
		int max = Maxarray(array);
		System.out.println(max);
		// linear search
		int search = Searcharr(array, item);
		System.out.println(search);
		int mid = BinarySearch(array2, 4588);
		System.out.println(mid);
		int lower = lowerBound(array3, 3);
		System.out.println(lower);
		int higher = higherBound(array3, 2);
		System.out.println(higher);

	}

	public static int Maxarray(int[] array) {
		System.out.println("max term");
		int max = Integer.MIN_VALUE; // for initial considering max as lowest value
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	// linear search O(n)

	public static int Searcharr(int[] array, int item) {
		System.out.println("linear search");
		for (int i = 0; i < array.length; i++) {
			if (item == array[i]) {
				return i;
			}
		}
		return 0;
	}

// comparison in linear is n ie n is length of array 
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

	public static int lowerBound(int[] array, int item) {
		System.out.println("lower  bound");
		int low = 0;
		int high = array.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < item) {
				low = mid + 1;
			} else if (array[mid] > item) {
				high = mid - 1;

			} else if (array[mid] == item) {
				ans = array[mid];
				high = mid - 1;
			}
			return ans;
		}
		return ans;

	}

	public static int higherBound(int[] array, int item) {
		System.out.println("higher  bound");
		int low = 0;
		int high = array.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < item) {
				low = mid + 1;
			} else if (array[mid] > item) {
				high = mid - 1;

			} else if (array[mid] == item) {
				ans = array[mid];
			}
			return ans;
		}
		return ans;
	}

}