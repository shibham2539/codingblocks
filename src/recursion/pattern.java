package recursion;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int col = 1;
		int n = 5;
		pattern(n, row, col);
	}

	public static void pattern(int n, int row, int col) {

		if (row > n + 1) {
			return;
		}

		if (col > row) {
			System.out.println();
			pattern(n,row+1,1);
			return;
		}
		System.out.print("*");
		pattern(n, row, col + 1);
	}

}
