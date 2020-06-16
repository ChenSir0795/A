package A;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,54,93,34,63,48,51,23,57,48,62};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min="+min);
	}
	

}
