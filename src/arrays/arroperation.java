package arrays;

import java.util.Scanner;

public class arroperation {

	// make scanner global
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = takeinput();
		displayarray(array);

	}

	// function to take input
	public static int[] takeinput() { // for returning array put int []
		System.out.println("enter the size?");

		int n = scn.nextInt(); // input from user about size
		int[] arr = new int[n]; // n is taken from user

		// for getting value in each index from user

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the value for " + i + " index");
			arr[i] = scn.nextInt(); // updating every value for each index
		}
		return arr;

	}
	public static void displayarray(int array[]) {
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
