package A;

public class price {
		public static void main(String[] args) {
		int price=3556;
		int[] money= {100,50,20,10,5,1};
		for(int i=0;i<6;i++) {
			System.out.println(money[i]+"т╙:"+price/money[i]+"уе");
			price=price%money[i];
		}
	}
}
