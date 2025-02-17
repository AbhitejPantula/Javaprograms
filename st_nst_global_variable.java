package PractiseAbhitej;
public class st_nst_global_variable
{
	static void areaofcircle (){
		int r = 5;
		double pi = 3.14;
		pi = 5;
		double area = pi*r*r;
		System.out.println("Area of Circle: "+ area);
	}
	void circumference (){
		int r = 5;
		double pi = 3.14;
		pi = 5;
		double area = 2*pi*r;
		System.out.println("Circumference: "+ area);
	}
	public static void main(String[] args){
		areaofcircle();
		st_nst_global_variable c1=new st_nst_global_variable();
		c1.circumference();
	}
}
