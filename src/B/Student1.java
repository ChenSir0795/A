package B;

public class Student1 {

	public static void main(String[] args) {
		// 创建对象
		Student2 s=new Student2();
		
		//给成员变量赋值
		s.name="林青霞";
		//s.age=-31;
		//调用show方法
		s.setAge(30);
		s.setAge(-31); 
		s.show();
	}

}
