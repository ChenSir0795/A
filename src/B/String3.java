package B;
import java.util.Scanner;
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) {
		//��֪�û������룬�ܹ������λ���
		//����¼���û������룬��Scannerʵ��
		String username="chenfan";
		String password="10086";
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û�����");
		String name=sc.nextLine();
		System.out.println("���������룺");
		String psw=sc.nextLine();
		//��equalsʵ��
		if(name.equals(username)&&psw.equals(password)) {
		System.out.println("����ɹ�");
		}
		if(2-i==0) {
			System.out.println("���Լ�����ը");
		}
		//0,1,2
		else {
			System.out.println("����ʧ�ܣ��㻹��"+(2-i)+"�λ���");
		}
	    }
	}
}
