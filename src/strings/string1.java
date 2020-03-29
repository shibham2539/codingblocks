package strings;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// part 1
		String ab = "shubham";
		// declaration of string is String variable name - "string";
		System.out.println(ab);
		System.out.println(ab.length()); // for the length of string variablename.length();

		// part 2

		System.out.println(ab.charAt(4)); // for individual element varaiblename.charAt(n);

		System.out.println(ab.charAt(ab.length() - 1));

		// part 3

		System.out.println(ab.substring(0, 5)); // for a substring use substring function ie
												// varaiblename.substring(include int ,exclude int);
		System.out.println(ab.substring(2, 4));
		System.out.println(ab.substring(ab.length() - 3, ab.length() - 1));

		System.out.println(ab.substring(2)); // substring(n); means all character including n to length-1;

		// part 4

		String s1 = "shubham";
		String s2 = "yadav";

		// two techniques to concat strings

		String s3 = s1 + s2;
		System.out.println(s3);

		String s4 = s1.concat(s2);
		System.out.println(s4);

		// part 5

		// index of i.e find the index of substring

		System.out.println(s4.indexOf("ha")); // it will return index and if not present then return -1
		System.out.println(s4.indexOf("amyada"));
		System.out.println(s4.indexOf("amYada"));
		
		// PART 6 
		//starts with if the string starts with the given value then it will return true else false 
		
		System.out.println(s4.startsWith("amYada"));
		System.out.println(s4.startsWith("shubham"));
		
		// PArt 7 equals to
		
		String a = "hello"; // here jvm check the intern pool 
		String b = a;  // here direct allocate same address no checking 
		String c = "hello"; // checks intern pool and due to duplicate same allocation 
		String d = new String("hello");  // create string hello in other location so no checking in intern pool 
		
		System.out.println((a==b) + " " +a.equals(b)); 
		System.out.println((a==c) + " " +a.equals(c));
		System.out.println((a==d) + " " +a.equals(d));
		
		
	}

}
