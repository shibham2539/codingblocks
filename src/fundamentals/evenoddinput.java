package fundamentals;

import java.util.Scanner;

public class evenoddinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in); // library for the input from users
		int n = scn.nextInt(); // scn.nextInt will capture the values and store in int n
		System.out.println(n);
		if (n % 2 == 0) {
			System.out.println("even no");

		} else {
			System.out.println("odd no");
		}
	}
}


