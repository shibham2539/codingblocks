package recursion;

public class findindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {4,5,6,7,4,5,6,4,3,4,6,5,4,5,6,4,6,7,6,2,3,4,6};
		int data = 4;
		int si = 0;
		int count = 0;
		int [] findindex = (array,data,si,count);
		displayarray(findindex);
		}
	
	public static int[] findindex(int [] array,int data, int si, int count) {
		
		int [] temp =null;
		if(si > array.length -1) {
			int [] base = new int [count];
			return;
		}
		
		if(array[si] == data) {
		temp = findindex(array,data,si+1,count+1);
		}
		else {
		temp = findindex(array,data,si+1,count);
		}
		if(array[si] == data) {
			temp [count] = si;
		}
		return temp;
	}
	public static void displayarray(int [] array) {
		
		for(int i =0;i < array.length-1;i++) {
			System.out.println(array[i]);
		}
	}
}