package B;

import java.util.ArrayList;

public class String11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array=new ArrayList<String>();
		array.add("Çñ½­");
		array.add("³ÂÅÎ");
		array.add("dui");
		
		for(int i=0;i<array.size();i++) {
			String s=array.get(i);
			System.out.print(s);
		}
	}

}
