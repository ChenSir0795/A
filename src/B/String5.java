package B;
import java.util.Scanner;
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String line=sc.nextLine();
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		for(int i=0;i<line.length();i++) {
		char ch=line.charAt(i);
		if(ch>='A'&&ch<'Z') {
			bigCount++;
		}
		else if(ch>'a'&&ch<'z') {
			smallCount++;
		}
		else if(ch>'0'&&ch<'9') {
			numberCount++;
		}
		}
		System.out.println("��д��ĸ��"+bigCount+"��");
		System.out.println("Сд��ĸ��"+smallCount+"��");
		System.out.println("����"+numberCount+"��");
	}

}
