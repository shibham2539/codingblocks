package datatypes;

public class datatype1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PART 1
		// default all are assigned to integer (default)
		byte b = 10;
		short sh = 122;
		int i = 43;
		long l = 32;

		// forceibly change b = (byte) sh;
		// b = sh it cannot do as sh has 2 bytes and byte has 1 byte
		// b = int
		// b = long

		sh = b;
		System.out.println(sh);
		// sh = int;
		// sh = long

		i = b;
		i = sh;
		// i = l;

		l = b;
		l = i;

		// part 2
		System.out.println("part2");
		b = 10; // as here the java implicitlly converts the 10 into byte as 10 is in range
		b = 127; // 127 is also in range
		b = (byte) 25443; // here it is explicitly converts into byte
		System.out.println(b);

		// part 3

		i = 1000000000;
		// i =100000000000000;
		// as to change into l add l OR L so that it understand to change int to l ie l
		// = 1000000000000000l;into l add l OR L so that it understand to change int to l ie l
		// = 1000000000000000l;
		l = 100000000000000L;

		// part 4
		// by default implicit conversion works for byte and short
		sh = 3200;
		b = 3;
		System.out.println(sh);

		// part 5
		// by default decimal no are of double type
		// so float = 3.45; cannot work as double cannot convert to float
		// float f = (float) 4.432;
		float f = 432.324f;

		double db = 42333;

		System.out.println(f);

		// part 6
		// conversion of float to int vice versa
		System.out.println("part6");
		i = 32;
		i = (int) f; // as float is 4 byes and int is 4 but it cant convert so explicit
		f = i;
		System.out.println(i);
		System.out.println(f);

		// part 7
		// boolean here 2 values true or flase
		boolean bit = true;
		// bit =1; or bit = 0 are wrong

		if (bit) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}
		bit = false;
		if (bit) {
			System.out.println("hello");
		} else {
			System.out.println("bye");
		}

		// part 8
		char ch = 'a';
		// first check that int value is in range so as it is char type so from unicode
		ch = 102; // asci value of 102 implicitly change to char
		System.out.println(ch);
		ch = 45553;
		System.out.println(ch);
		ch = 64000;
		System.out.println(ch);
		ch = 99;
		// ch = ch +2 ;as int is of 4 byte and char is 2 so it can be out of range
		
		
		
///h = (char) (ch + 2);
		System.out.println(ch);

		i = ch;
		System.out.println(i);

	}
}
