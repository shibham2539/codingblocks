package doublearray;

public class doublearrayfacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[][] array = new int [][4]; not possible
		int[][] array = new int[4][]; // possible as the reference in 1 d array is null ;

		System.out.println(array[2]);

		array[1] = new int[3];
		array[2] = new int[2];

		System.out.println(array[1]); // as now they will contain as address not null as it has now address
		System.out.println(array[2]);
	
		display(array);
	}

	public static void display(int[][] array1) {
		System.out.println("2d display");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();

		}
	}

}
