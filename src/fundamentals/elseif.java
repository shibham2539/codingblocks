package fundamentals;

import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n >= 60) {
			System.out.println("old person");
		} else if (n <= 11) {
			System.out.println("child");
		} else 
			System.out.println("teenager");
	}
}

