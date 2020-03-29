package doublearray;

import java.util.Scanner;

public class inputanddisplayin2d {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] array = takeinput();
		display(array);

	}

	public static int[][] takeinput() {

		System.out.println("enter the no of rows");
		int n = scn.nextInt();
		System.out.println("enter the no of coloums");
		int m = scn.nextInt();
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = scn.nextInt();
			}
		}
		return array;
	}

	public static void display(int[][] array) {
		System.out.println("displaying the array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
}
