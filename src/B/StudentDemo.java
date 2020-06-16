package B;
//学生测试类
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象t
		Student s=new Student();
		//使用对象
		//给成员变量赋值
		s.name="林青霞";
		s.age=30;
		System.out.println(s.name+","+s.age);
		s.study();
		s.dohomework();
				
	}

}
