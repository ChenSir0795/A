package A;
import java.util.Random;
import java.util.Scanner;
public class Random1 {
	public static void main(String[] args) {
		Random r=new Random();
		int number=r.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int guessnumber=sc.nextInt();
		System.out.println(number);
		if(guessnumber<number) {
			System.out.println("��µ�����С��");
		}
		else if(guessnumber>number) {
			System.out.println("��µ����ִ���");
		}
		else {
			System.out.println("��µ����ָպ�");
		}
		
	}
}
