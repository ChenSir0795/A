package B;

public class Student3 {
	//��Ա����
	private String name;
	private int age;
//	public void setAge(int a) {
//		age=a;
//	}
	public void setAge(int age) {
		this.age=age;//this���εı������ڳ�Ա����
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