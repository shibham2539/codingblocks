package function;

public class functiondemoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");

		// demo varaibles
		int one = 10; // variable one and two are local to main 
		int two = 20;
		int sum = addtiondemoscope(one, two);
		System.out.println(sum);   // sum is also local
	}

	public static int addtiondemoscope(int a, int b) {
		int sum1 = a + b;   // a and b are local to this additondemoscope
		// int sum1 = one + two it gives error as one and two are not local variable of this func
		return sum1;

	}
}