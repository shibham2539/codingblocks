package function;

import java.util.Scanner;

public class anybasetodecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt();
		int sbase = scn.nextInt();
		int ans = anyBaseToDecimal(snum, sbase);
		System.out.println(ans);
	}

	public static int anyBaseToDecimal(int snum, int sbase) {
		int multiplier = 1;
		int ans = 0;
		while (snum != 0) {
			int rem = snum % 10;
			ans = ans + (rem * multiplier);
			multiplier = multiplier * sbase;
			snum = snum / 10;

		}
		return ans;
	}

}