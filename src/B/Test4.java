package B;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���������ķ�����");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>90) {
			System.out.println("A");
		}
		else if(a>=80&&a<90) {
			System.out.println("B");
		}
		else if(a>=70&&a<80) {
			System.out.println("C");
		}
		else if(a>=60&&a<70) {
			System.out.println("D");
		}	
		else if(a>=0&&a<60) {
			System.out.println("������");
		}	
		else
			System.out.println("����ķ�������");
		
	}

}
