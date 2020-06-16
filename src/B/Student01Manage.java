package B;

import java.util.ArrayList;
import java.util.Scanner;

public class Student01Manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student01>array=new ArrayList<Student01>();
		while(true) {
		System.out.println("--------欢迎来到学生管理系统--------");
		System.out.println("1 添加学生");
		System.out.println("2 删除学生");
		System.out.println("3 修改学生");
		System.out.println("4 查看所有学生");
		System.out.println("5 退出");
		System.out.println("请再次输入");
		Scanner sc=new Scanner(System.in);
		String Line=sc.nextLine();
		
		switch(Line) {
		case "1":
			addStudent(array);
			break;
		case "2":
		deleteStudent(array);
			break;
		case "3":
			//System.out.println("修改学生");
			updateStudent(array);
			break;
		case "4":
			findAllStudent(array);
			break;
		case "5":
			System.out.println("谢谢使用");
			System.exit(0);;
		
		}
		}	
		}

 	public static void addStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("请输入你的学号：");
 		String sid=sc.nextLine();
 		System.out.println("请输入你的姓名：");
 		String name=sc.nextLine();
 		System.out.println("请输入你的年龄：");
 		String age=sc.nextLine();
 		System.out.println("请输入你的居住地：");
 		String address=sc.nextLine();
 		Student01 s=new Student01();
 		s.setSid(sid);
 		s.setName(name);
 		s.setAge(age);
 		s.setAddress(address);
 		array.add(s);
 		System.out.println("添加学生成功");
 	}
 	public static void findAllStudent(ArrayList<Student01> array) {
 		if(array.size()==0) {
 			System.out.println("抱歉，没有该学生的信息请添加");
 		}
 	
 		System.out.println("学号\t\t姓名\t年龄\t居住地\t");
 		for(int i=0;i<array.size();i++) {
 			Student01 s=array.get(i);
 			System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
 			
 		}
 	}
 	/*
 	public static void deleteStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("选择你要删除的学号：");
 		String sid=sc.nextLine();
 		for(int i=0;i<array.size();i++) {
 			Student01 s=array.get(i);
 			if(s.getSid().equals(sid)) {
 				array.remove(i);
 				break;
 			}
 		}
 		System.out.println("删除成功");
 	}*/
 	public static void deleteStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("选择你要删除的学号：");
 		String sid=sc.nextLine();
 		int index=-1;
 		for(int i=0;i<array.size();i++) {
 			Student01 s=array.get(i);
 			if(s.getSid().equals(sid)) {
 				index=i;
 				break;
 			}
 		}
 		if(index==-1) {
 			System.out.println("您输入的的数据有误");
 		}else {
 			array.remove(index);
 		}
 		System.out.println("删除成功");
 	}
 	public static void updateStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("请输入您要修改的学号：");
 		String sid=sc.nextLine();
 		System.out.println("请输入新名字：");
 		String name=sc.nextLine();
 		System.out.println("请输入年龄：");
 		String age=sc.nextLine();
 		System.out.println("请输入您的地址：");
 		String address=sc.nextLine();
 		Student01 s=new Student01();
 		s.setSid(sid);
 		s.setName(name);
 		s.setAge(age);
 		s.setAddress(address);
 		for(int i=0;i<array.size();i++) {
 			Student01 student=array.get(i);
 			if(student.getSid().equals(sid));
 			array.set(i,s);
 			break;
 		}
 		System.out.println("添加成功");
 	}
}