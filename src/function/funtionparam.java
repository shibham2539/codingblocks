package function;

public class funtionparam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		addition();

		System.out.println("bye");
		additionparam(10, 20);
		additionparam(30, 40);

	}

	public static void additionparam(int a, int b) {

		int sum = a + b;

		System.out.println(sum);
	}

	public static void addition() {

		int n1 = 10;
		int n2 = 20;
		int sum = n1 + n2;
		System.out.println(sum);

	}
}
