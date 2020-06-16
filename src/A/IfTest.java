package A;
import java.util.Scanner;
public class IfTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter a number:");
	int number=sc.nextInt();
	if(number%2==0) {
		System.out.println(number+"Å¼Êı");
		}
		else {
		System.out.println(number+"ÆæÊı");
		}
}
}

