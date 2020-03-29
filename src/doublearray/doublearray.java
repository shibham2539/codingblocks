package doublearray;

public class doublearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [][] array = new int [3][5];  // initializing 2 d array
			// or u can initialize array = new int [3][5] ;
			array[0][3] = 6;
			System.out.println(array);
			System.out.println(array.length);   // this  will print no of rows
			System.out.println(array[0].length);  // this will print no of columns
			
			System.out.println(array[0][3]);
			System.out.println(array[0][2]);
			
			
			display (array);
	}
	public static void display(int [][] array1) {
		System.out.println("2d display");
		for(int i = 0; i < array1.length; i ++) {
			for(int j=0;j< array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
