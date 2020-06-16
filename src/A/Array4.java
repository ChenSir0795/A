package A;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,54,93,34,63,48,51,23,57,48,62};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println("average="+(sum/arr.length));
	}

}
