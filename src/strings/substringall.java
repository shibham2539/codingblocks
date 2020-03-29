package strings;

public class substringall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Shubham";

		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++)
				System.out.println(input.substring(i, j + 1));
		}

	}
}