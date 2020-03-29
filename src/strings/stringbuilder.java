package strings;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("hello");
		
		//PRINTS LENGTH 
		System.out.println(sb.length());
		
		// prints charactar at particular position 
		
		System.out.println(sb.charAt(2));
		
		//add character at last
		sb.append("dhwud");
		System.out.println(sb);
		
		// insert 
		
		sb.insert(2, "abc");
		System.out.println(sb);
				
		
		//delete
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		// update char at particular position
		
		sb.setCharAt(2, 's');
		System.out.println(sb);
	
		
	}

}
