package strings;
import java.util.*;

public class stringinput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 // for taking string as input 

		String input = scn.nextLine();
		 displayString(input);
	}
	
	public static void displayString(String dis) {
		
		for(int i = 0; i < dis.length(); i ++) {
			System.out.println(dis.charAt(i));
			
		}
	}

}
