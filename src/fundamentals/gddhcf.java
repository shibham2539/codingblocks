package fundamentals;

import java.util.Scanner;

public class gddhcf {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int no1 = scn.nextInt();
		int no2 = scn.nextInt();

		while (no1 % no2 != 0) {
			int rem = no1 % no2;
			no1 = no2;
			no2 = rem;

		}
		System.out.println(no2);

	}

}



