package B;

public class Student2 {
	//��Ա����
	String name;
	//int age;
	private int age;
	//�ṩset/get
	//��Ա����
	public void setAge(int a) {
	//	age=a;
		if(a<0||a>120) {
			System.out.println("��������������");
		}
		else {
			age=a;
		}
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println(name+","+age);
	}
}
