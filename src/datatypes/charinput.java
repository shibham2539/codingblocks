package datatypes;

import java.util.Scanner;

public class charinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("lower case");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("upper case");
		} else {
			System.out.println("invalid case");
		}

	}

}



