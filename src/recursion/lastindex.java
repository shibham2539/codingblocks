package recursion;

public class lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {0,3,4,5,6,7,51,334,555,6,5,64,4,3,2,1};
		int si = array.length-1;
		int data = 0;
		int ans = lastindexof(array,si,data);
		System.out.println(ans);
	}
	
	public static int lastindexof(int array[],int si,int data) {
		
		if(si == 0) {
			return -1;
		}
		if(array[si] ==data) {
			return si;
		}
		else {
			int ans = lastindexof(array,si-1,data);
			return;
		}
	}

}
