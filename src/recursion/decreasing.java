package recursion;

import java.util.Scanner;

public class decreasingstackbuild{
// recursion when the stack is building 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		decrement(n);
		
	}
	public static void decrement(int n) {
		if(n==0) {   // base case
			return;  // this will halt 
		}
		System.out.println(n);
		decrement(n-1);
	}
}

