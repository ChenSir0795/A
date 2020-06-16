package B;
import java.util.Scanner;
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数据：");
		String line=sc.nextLine();
		System.out.println(solve(line));
	}
	
	public static String solve(String S) {
		if(S==null || S.length()<=2)	return S;
		
		StringBuilder sb=new StringBuilder();
		sb.append(S.charAt(0));
		int count=1;
		for(int i=1;i<S.length();i++) {
			if(S.charAt(i)==S.charAt(i-1)) {
				count++;
			}
			else {
				sb.append(count).append(S.charAt(i));
				count=1;
			}
		}
		sb.append(count);
		return sb.length()<S.length()?sb.toString():S;
	}
}
