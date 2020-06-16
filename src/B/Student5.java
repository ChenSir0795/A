package B;

public class Student5 {
	private String name;
	private int age;
	
	public Student5(String name) {
		this.name=name;
	}
	public Student5(int age) {
		this.age=age;
	}
	public void show() {
		System.out.println(name+","+age);
	}
	public Student5(String name,int age) {
		this.name=name;
		this.age=age;
	}
		
	
}
