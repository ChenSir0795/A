package A;

public class height {
	public static void main(String[] args){
	int height1=150;
	int height2=210;
	int height3=165;
	int tempheight=height1>height2?height1:height2;
	int maxheight=tempheight>height3?tempheight:height3;
	System.out.println("maxheight"+maxheight);
	

}
}