package A;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=20;i++) {
			for(int j = 0;j<=33;j++) {
				float k=100-i-j;
				if(i*5+j*3+(k/3)==100) {
					System.out.println(i+","+j+","+(int)k);
				}
			}
		}
	}

}
