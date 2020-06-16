	package A;

public class tuzi {

	public static void main(String[] args) {
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
//		arr[2]=arr[0]+arr[1];
//		arr[3]=arr[1]+arr[2];
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		System.out.println("第二十个月的兔子是："+arr[19]);
	}

}
