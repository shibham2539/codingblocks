package datatypes;

public class ftoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fmin = 0;
		int fmax = 300;
		int fstep = 20;
		int celsius;
		while (fmin <= fmax) {
			// 5/9 gives 0.55 so int value becomes 0 so we have to take 5 as double and explicit all to int 
			celsius = (int) ((5.0/9) * (fmin - 32));
			System.out.println(fmin + "\t" + celsius);
			fmin = fmin + fstep;
		}

	}

}


