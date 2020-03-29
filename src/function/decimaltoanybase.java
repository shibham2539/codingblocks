package function;

import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int dnum = scn.nextInt();
		int sbase = scn.nextInt();
		

		int answer = decimaltoanybase(dnum, sbase);
		System.out.println(answer);
	}

	public static int decimaltoanybase(int dnum, int sbase) {

		
		int multiplier = 1;
		int ans = 0;

		while (dnum != 0) {

			int remainder = dnum % sbase;
			ans = ans + (remainder * multiplier);
			multiplier = multiplier * 10;

			dnum = dnum / sbase;
		}
		return ans;

	}

}
