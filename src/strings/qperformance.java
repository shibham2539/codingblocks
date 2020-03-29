package strings;

public class qperformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		append(100000);
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

	public static void append (long n) {
		
		String s = "";
		
		for (int i =0 ; i < n ; i ++) {
			s = s + i;    // string plus integer gives string 
			// so here 1 , 2 ,3 ,,,100000 will have different memory location as it is muteable
		}
	}
}
