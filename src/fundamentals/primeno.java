package fundamentals;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int div = 2;
		boolean flag = true;
		while (div <= n - 1) {

			if (n % div == 0) {

				flag = false;
			}

			div++;
		}

		if (flag == true) {

			System.out.println("prime no");
		} else {
			System.out.println("not a prime no ");
		}
	}

}
