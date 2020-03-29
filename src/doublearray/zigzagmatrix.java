package doublearray;

import java.util.Scanner;

public class zigzagmatrix {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] array = takeinput();
		
		display(array);
	}

	public static int[][] takeinput() {
		System.out.println("enter the no of rows in matrix");
		int rows = scn.nextInt();
		int[][] array = new int[rows][];

		for (int i = 0; i < rows; i++) {
			System.out.println("enter the no of coloums for row "  +i);
			int cols = scn.nextInt();
			array[rows] = new int[cols];
			for (int j = 0; j < cols; j++) {
				array[i][j] = scn.nextInt();
			}
		}
		return array;
	}
	
	public static void display(int [][] array) {
		
		for(int i=0;i< array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
