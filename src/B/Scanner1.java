package B;
import java.util.Scanner;
public class Scanner1 {
/*
 Scanner:
 	���ڻ�ȡ����¼�����ݡ��������������ͣ��ִ������ݣ�
 	public String nextline();
 	a��ȡ����¼���ַ�������
 	
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		Scanner sc=new Scanner(System.in);
		//��������
		System.out.println("����������һ���ַ���");
		String line=sc.nextLine();
		//������
		System.out.println("������������ǣ�"+line);
	}

}
