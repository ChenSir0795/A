package B;
import java.util.ArrayList;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Array3> array=new ArrayList<Array3>();
		Array3 s1=new Array3("邱江",20);
		//只有类能创建
		//s1.Student11("邱江",20);
		Array3 s2=new Array3("陈盼",30);
		//s2.Student11("陈盼",30);
		Array3 s3=new Array3("邱炫",30);
		//s3.Student11("邱炫",30);
		array.add(s1);
		array.add(s2);
		array.add(s3);
		for(int i=0;i<array.size();i++) {
			Array3 s=array.get(i);
		System.out.println(s.getName()+s.getAge());
		}
	}

}
