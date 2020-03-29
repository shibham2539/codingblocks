package recursion;

import java.util.Scanner;

public class stackfall {

	// when stack is building

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		decrement(n);

	}

	public static void decrement(int n) {
		if (n == 0) { // base case
			return; // this will halt
		}

		decrement(n-1);
		System.out.println(n);
	}

}
