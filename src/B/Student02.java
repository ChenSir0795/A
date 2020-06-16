package B;
//多个对象
public class Student02 {

	public static void main(String[] args) {
		// 创建第一个对象并使用
		Student s1=new Student();
		s1.name="邱炫";
		s1.age=17;
		System.out.println(s1.name+","+s1.age);
		s1.study();
		s1.dohomework();
		//创建第二个对象并使用
		Student s2=s1;
		s2.name="陈盼";
		s2.age=28;
		System.out.println(s2.name+","+s2.age);
		s2.study();
		s2.dohomework();
				
	}

}
