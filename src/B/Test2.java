package B;

public class Test2 {
	public static void main(String[] args) {
		int j=0;
		int i=0;
		int x=(j++)+(j++)+j;
		int y=(i++)+(i++)+(i++);
		System.out.println(x);
		System.out.println(y);
    }
}