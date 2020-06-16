package A;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,45,67,89};
		int[] arr2= {12,23,45,67,8};
		boolean flag=compare(arr,arr2);
		System.out.println(flag);
	}
	
	public static boolean compare(int[] arr,int[] arr2 ) {
		if(arr.length!=arr.length) {
			return false;
		}
		for(int x=0;x<arr.length;x++) {
			if(arr[x]!=arr2[x]) 
				return false;
			
		}
			return true;
	}
}

