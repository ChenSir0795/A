package B;

public class Student2 {
	//成员变量
	String name;
	//int age;
	private int age;
	//提供set/get
	//成员方法
	public void setAge(int a) {
	//	age=a;
		if(a<0||a>120) {
			System.out.println("您给的年龄有误");
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
