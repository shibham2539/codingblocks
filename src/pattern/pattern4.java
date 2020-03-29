package pattern;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int row = scn.nextInt();
		int i = 1;

		int nst = 1;
		int nsp = row - 1;
		// no of rows
		while (i <= row) {

			// space work
			int csp = 1;
			while (csp <= nsp) {

				System.out.print(" ");

				csp++;

			}
			int cst = 1;
			while (cst <= nst) {

				System.out.print("*");

				cst++;
			}
			// preparation
			System.out.println();
			
			nst++;
			nsp--;
			i++;
		}

	}

}
