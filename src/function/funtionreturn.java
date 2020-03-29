package function;

public class funtionreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		System.out.println("bye");
		// part 3 function return

		int sum = additionreturn(10, 60, 80); // here sum is localvariable to main
		System.out.println(sum);
	}

	public static int additionreturn(int a, int b, int c) { // here a,b,c is local variable to additonreturn function
		int addsum = a + b + c;

		return addsum;

	}
}

	