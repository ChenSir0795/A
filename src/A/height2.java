package A;
//导包
import java.util.Scanner;
public class height2 {
	public static void main(String[] args) {
		//创建对象
		Scanner var=new Scanner(System.in);
		System.out.println("请输入第一个和尚的身高:");
		//接手数据
		int height1=var.nextInt();
		System.out.println("请输入第二个和尚的身高:");
		int height2=var.nextInt();
		System.out.println("请输入第三个和尚的身高:");
		int height3=var.nextInt();
		int tempheight=height1>height2?height1:height2;
		int maxheight=tempheight>height3?tempheight:height3;
		System.out.println("maxheight:"+maxheight);
	}
}