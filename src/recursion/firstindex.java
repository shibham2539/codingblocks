package recursion;

public class firstindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 4, 3, 8, 5, 6, 7, 4, 8, 7, 42 };
		int data = 7;
		int si = 0;
		int ans = firstindex(array, data, si);
		System.out.println(ans);

	}

	public static int firstindex(int[] array, int data, int si) {
		if (si == array.length - 1) {
			return -1;
		}
		if (array[si] == data) {
			return si;
		} else {
			int ans = firstindex(array, data, si + 1);
			return ans;
		}
	}

}
