package B;

import java.util.ArrayList;
import java.util.Scanner;

public class Student01Manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student01>array=new ArrayList<Student01>();
		while(true) {
		System.out.println("--------��ӭ����ѧ������ϵͳ--------");
		System.out.println("1 ���ѧ��");
		System.out.println("2 ɾ��ѧ��");
		System.out.println("3 �޸�ѧ��");
		System.out.println("4 �鿴����ѧ��");
		System.out.println("5 �˳�");
		System.out.println("���ٴ�����");
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
			//System.out.println("�޸�ѧ��");
			updateStudent(array);
			break;
		case "4":
			findAllStudent(array);
			break;
		case "5":
			System.out.println("ллʹ��");
			System.exit(0);;
		
		}
		}	
		}

 	public static void addStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("���������ѧ�ţ�");
 		String sid=sc.nextLine();
 		System.out.println("���������������");
 		String name=sc.nextLine();
 		System.out.println("������������䣺");
 		String age=sc.nextLine();
 		System.out.println("��������ľ�ס�أ�");
 		String address=sc.nextLine();
 		Student01 s=new Student01();
 		s.setSid(sid);
 		s.setName(name);
 		s.setAge(age);
 		s.setAddress(address);
 		array.add(s);
 		System.out.println("���ѧ���ɹ�");
 	}
 	public static void findAllStudent(ArrayList<Student01> array) {
 		if(array.size()==0) {
 			System.out.println("��Ǹ��û�и�ѧ������Ϣ�����");
 		}
 	
 		System.out.println("ѧ��\t\t����\t����\t��ס��\t");
 		for(int i=0;i<array.size();i++) {
 			Student01 s=array.get(i);
 			System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
 			
 		}
 	}
 	/*
 	public static void deleteStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("ѡ����Ҫɾ����ѧ�ţ�");
 		String sid=sc.nextLine();
 		for(int i=0;i<array.size();i++) {
 			Student01 s=array.get(i);
 			if(s.getSid().equals(sid)) {
 				array.remove(i);
 				break;
 			}
 		}
 		System.out.println("ɾ���ɹ�");
 	}*/
 	public static void deleteStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("ѡ����Ҫɾ����ѧ�ţ�");
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
 			System.out.println("������ĵ���������");
 		}else {
 			array.remove(index);
 		}
 		System.out.println("ɾ���ɹ�");
 	}
 	public static void updateStudent(ArrayList<Student01> array) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("��������Ҫ�޸ĵ�ѧ�ţ�");
 		String sid=sc.nextLine();
 		System.out.println("�����������֣�");
 		String name=sc.nextLine();
 		System.out.println("���������䣺");
 		String age=sc.nextLine();
 		System.out.println("���������ĵ�ַ��");
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
 		System.out.println("��ӳɹ�");
 	}
}