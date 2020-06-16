package A;

public class ArrTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,455,2443,4535,245};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max:"+max);
		
	}

}
