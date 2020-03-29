package recursion;

public class arraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,6,7,34,54,55,466};
		int si = 0;
		boolean ans = sorted(arr,si);
		System.out.println(ans);
	}
	public static boolean sorted(int[] arr,int si) {
		
		if(arr.length-1 == si) {
			return true ;
		}
		
		if(arr[si] > arr[si+1]) {
			return false;  
		}else 
		{	
		boolean ans = sorted(arr,si+1);
		return ans;
		}		
}
}
