package A;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,34,545,45,34};
		printArray(arr);
		reverse1(arr);
		//System.out.println(y);
	}
	
	public static void reverse1(int[] arr1) {
		for(int start=0,end=arr1.length-1;start<=end;start++,end--) {
			int temp=arr1[start];
				arr1[start]=arr1[end];
				arr1[end]=temp;	
		}
		printArray(arr1);
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x==arr.length-1) 
			{
				System.out.print(arr[x]);
			}
			else 
			{
				System.out.print(arr[x]+",");
			}
		}
		System.out.println("]");
	}
}
