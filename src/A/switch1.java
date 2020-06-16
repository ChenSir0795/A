package A;
import java.util.Scanner;
public class switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入分数：");
		int score=sc.nextInt();
		
	 switch(score/10) {
		   case 10:case 9:System.out.println("A");
		                    break;
		   case 8:case 7:System.out.println("B");
		                    break;
		   case 6:System.out.println("C");
		                    break;
		   case 5:case 4:case 3:case 2:case 1:case 0:
		                System.out.println("不及格");
		                    break;
		                   
	 	                    
	 }
	}
}
