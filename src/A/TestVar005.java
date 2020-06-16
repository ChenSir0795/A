package A;

public class TestVar005 {
	
		public static void main(String[] args){
			boolean flag1=true;
			System.out.println("flag1="+flag1);
			boolean flag2=false;
			System.out.println("flag2="+flag2);
			boolean flag3=5<9;
			System.out.println("flag3="+flag3);
			boolean flag4=23>89;
			System.out.println("flag4"+flag4);
			if(flag4==true) {
				System.out.println("第一个数大于第二个数");
				
			}
			if(flag4==false) {
				System.out.println("第一个数小于第二个数");
			}
}
}
