package A;
import java.util.Scanner;
public class ifusage {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("please enter a number:");
			int a=sc.nextInt();
			System.out.println("please enter second numbers:");
			int b=sc.nextInt();
			if(a>b) {
				System.out.println("a");
			}
			else
			{
				System.out.println("b");
			}
		}
	}

}
