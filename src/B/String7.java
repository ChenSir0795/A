package B;
import java.util.Scanner;
public class String7 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("������һ���ַ���");
	String line=sc.nextLine();
	String s=reverse(line);
	System.out.println(s);
	}	
	
	public static String reverse(String s) {
		String ss="";
		for(int i=s.length()-1;i>=0;i++) {
			ss+=s.charAt(i);
		}
		return ss;
	}
	
}
