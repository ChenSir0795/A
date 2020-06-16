package B;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		String a=arrayToString(arr);
		System.out.println(a);
	}
	public static String arrayToString(int[] arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
		    if(i==arr.length-1) {
		    	sb.append(arr[i]);
		    }else {
		    	sb.append(arr[i]).append(",");
		    }
		}
		sb.append("]");	
		String s=sb.toString();
		return s;
	}
}
