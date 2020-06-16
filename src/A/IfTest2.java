package A;
import java.util.Scanner;
public class IfTest2 {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("开始");
	int week=sc.nextInt();
	if(week==1) {
		System.out.println("星期一");
		
	}
	else if(week==2) {
		System.out.println("星期二");
	}
	else {
		System.out.println("No");
	}
	
}

	



}
