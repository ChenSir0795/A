package B;
import java.util.ArrayList;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Array3> array=new ArrayList<Array3>();
		Array3 s1=new Array3("��",20);
		//ֻ�����ܴ���
		//s1.Student11("��",20);
		Array3 s2=new Array3("����",30);
		//s2.Student11("����",30);
		Array3 s3=new Array3("����",30);
		//s3.Student11("����",30);
		array.add(s1);
		array.add(s2);
		array.add(s3);
		for(int i=0;i<array.size();i++) {
			Array3 s=array.get(i);
		System.out.println(s.getName()+s.getAge());
		}
	}

}
