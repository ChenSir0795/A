package B;

public class Student3 {
	//成员变量
	private String name;
	private int age;
//	public void setAge(int a) {
//		age=a;
//	}
	public void setAge(int age) {
		this.age=age;//this修饰的变量用于成员变量
	}
	public int getAge() {
		return age;
	}

	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	public void show() {
		System.out.println(name+","+age);
	}
}