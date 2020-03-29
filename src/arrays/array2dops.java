package arrays;

public class array2dops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[3][3];
		display(array);
		displayinequal(array);
	}

	public static void display(int[][] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= array.length - 1; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static void displayinequal(int[][] array) {
		System.out.println("display inequal");
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}

	}
}
