package A;


import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in); //������������
		  int n = sc.nextInt();  //�ȴ�����һ��int���͵�����n
		  for(int i = 1;i <= n;i++){  //���ѭ����������
		   for(int j = 1;j <= i;j++){   //�ڲ�ѭ������ÿ�е�����
		    System.out.print("*");
		   }
		   System.out.println(); //����
		  }
		 }
	}


