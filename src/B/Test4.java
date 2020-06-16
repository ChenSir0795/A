package B;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入您的分数：");
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
			System.out.println("不及格");
		}	
		else
			System.out.println("输入的分数有误");
		
	}

}
