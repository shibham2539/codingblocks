package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int i = 1;
		int nst = row;

		while (i <= row) { // no of rows
			int cst = 1;
			while (cst <= nst) { // work

				System.out.print("*");

				cst++;

			}

			System.out.println(); // preparation
			i++;
			nst--;


	}

}
}
