package function;

public class functionglobal {

	public static int val = 10; // this is global variable and it should be outside all the function and inside
								// the class

	public static void main(String[] args) {
		System.out.println(val); // here it prints the global variable
		System.out.println("hello");

		int one = 10;
		int two = 20;
		int sum = addtiondemoscope(one, two);
		int val = 80; // this is local varibale to main
		System.out.println(val); // here the local variable wins with global
		System.out.println(functionglobal.val); // to print global
		System.out.println(sum);
		// System.out.println(three); three varaiable only access to inside if block
		// scope
		int ans = globalscope(10);
		System.out.println(ans);

		// block scope
		// varaiable outside block are accesss to inside block
		// varaiable inside block are not accesss to outside block
		if (one < two) {
			int three = 20; //
			System.out.println(three);
		}

		// function by value
		System.out.println("system: pass by value");
		System.out.println(one + " " + two);
		Swap(one, two);
		System.out.println(one + " " + two);
		
	}
	
	public static void Swap(int a, int b) {
		System.out.println("swap ");
		int temp;
		 temp = a;
		 a=b;
		 b=temp;
		
		 System.out.println(a + " " + b);
	}
	public static int addtiondemoscope(int a, int b) {
		int sum1 = a + b;
		System.out.println(val); // see that global can be accessed from anywhere
		return sum1;

	}

	public static int globalscope(int a) {
		int sum = val + a;
		return a;

	}

}
