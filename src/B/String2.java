package B;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chs= {'a','b','c'};
		String s1=new String(chs);
		String s2=new String(chs);
		String s3="abc";
		String s4="abc";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		//比较字符串的内容是否相同
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
	}

}
