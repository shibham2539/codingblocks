package fundamentals;

public class variablesandoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c ;
		c = a + b;
		
		System.out.println("additon of a + b is " + c );
		
		// Hint  c = a*b cannot be possible as we cannot initialize to same variable as above 
		
		c = a * b  ; //  as here we can reinitiliaze  
		System.out.println("multiplication of a and b is " + c);
	}

}

