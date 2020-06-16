package B;
import java.util.Scanner;
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) {
		//已知用户名密码，总共给三次机会
		//键盘录入用户名密码，用Scanner实现
		String username="chenfan";
		String password="10086";
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name=sc.nextLine();
		System.out.println("请输入密码：");
		String psw=sc.nextLine();
		//用equals实现
		if(name.equals(username)&&psw.equals(password)) {
		System.out.println("登入成功");
		}
		if(2-i==0) {
			System.out.println("电脑即将爆炸");
		}
		//0,1,2
		else {
			System.out.println("登入失败，你还有"+(2-i)+"次机会");
		}
	    }
	}
}
