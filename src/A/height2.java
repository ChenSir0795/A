package A;
//����
import java.util.Scanner;
public class height2 {
	public static void main(String[] args) {
		//��������
		Scanner var=new Scanner(System.in);
		System.out.println("�������һ�����е����:");
		//��������
		int height1=var.nextInt();
		System.out.println("������ڶ������е����:");
		int height2=var.nextInt();
		System.out.println("��������������е����:");
		int height3=var.nextInt();
		int tempheight=height1>height2?height1:height2;
		int maxheight=tempheight>height3?tempheight:height3;
		System.out.println("maxheight:"+maxheight);
	}
}