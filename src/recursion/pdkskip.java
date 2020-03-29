package recursion;

import java.util.Scanner;

public class pdkskip {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		pdkskip(n);

	}

	public static void pdkskip(int n) {

		if (n == 0) { // base case
			return;
		}

		if (n % 2 == 1) {
			System.out.println(n);
		}

		pdkskip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

}
