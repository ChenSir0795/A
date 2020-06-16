package A;
import java.util.Random;
import java.util.Scanner;
public class Random1 {
	public static void main(String[] args) {
		Random r=new Random();
		int number=r.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int guessnumber=sc.nextInt();
		System.out.println(number);
		if(guessnumber<number) {
			System.out.println("你猜的数字小了");
		}
		else if(guessnumber>number) {
			System.out.println("你猜的数字大了");
		}
		else {
			System.out.println("你猜的数字刚好");
		}
		
	}
}
