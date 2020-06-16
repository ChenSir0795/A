package B;
import java.util.Scanner;
public class Scanner1 {
/*
 Scanner:
 	用于获取键盘录入数据。（基本数据类型，字串符数据）
 	public String nextline();
 	a获取键盘录入字符串数据
 	
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Scanner sc=new Scanner(System.in);
		//接手数据
		System.out.println("请输数据入一个字符串");
		String line=sc.nextLine();
		//输出结果
		System.out.println("你输入的数据是："+line);
	}

}
