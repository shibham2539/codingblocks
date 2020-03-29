package fundamentals;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int i =1;
		int fact = 1;
		while(i <= n) {
			 fact = fact * i;
			i++;
		}
		System.out.println(fact);
		
	}

}


