package function;

import java.util.Scanner;

public class anytodecimal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int snum = scn.nextInt();
		int sbase = scn.nextInt();
		int ans = anytodecimal(snum, sbase);
		System.out.println(ans);

	}

	public static int anytodecimal(int snum, int sbase) {

		int multiplier = 1;
		int ans = 0;
		while (snum != 0) {
			int rem = snum % 10;
			ans = ans + (multiplier * rem);
			multiplier =  multiplier * sbase;
			snum = snum / 10;
		}
		return ans;
		

	}
}
