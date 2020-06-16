package A;


import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in); //监听键盘输入
		  int n = sc.nextInt();  //等待输入一个int类型的数据n
		  for(int i = 1;i <= n;i++){  //外层循环决定行数
		   for(int j = 1;j <= i;j++){   //内层循环控制每行的内容
		    System.out.print("*");
		   }
		   System.out.println(); //换行
		  }
		 }
	}


