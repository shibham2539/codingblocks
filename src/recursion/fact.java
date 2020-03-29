package recursion;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
		int Power = power(n, x);
		System.out.println(Power);
		int fibo = fibonacci(n);
		System.out.println(fibo);

	}

	public static int factorial(int n) {
		if (n == 1) { // base case
			return 1;
		}

		int smallanswer = factorial(n - 1);
		return n * smallanswer;
	}

	public static int power(int n, int x) {
		if (x == 0) {
			return 1;
		}
		int smallanswer = power(n , x-1);
		return n * smallanswer;
	}
	public static int fibonacci(int n) {
		if(n == 1) {
			return 1;
		}
		if (n==0) {
			return 0;
		}
		int fibo1 = fibonacci(n-1);
		int fibo2 = fibonacci(n-2);
		return fibo1+fibo2;
	}
}
