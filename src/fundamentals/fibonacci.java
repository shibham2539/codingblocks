package fundamentals;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int first = 1;
		int i = 0;
		int j = 1;
		int sum = 0;

		while (first <= n) {
			sum = i + j;
			System.out.println(i);
			i = j;
			j = sum;
			first++;
		}

	}

}



