package PractiseAbhitej;
public class st_nst_local_variable
{
	public static void print ()
	{
		int a = 100;
		a=50;
		System.out.println(a);		
	}	
	void solution ()
	{
		int b = 200;
		b=150;
		System.out.println(b);		
	}
	public static void main(String[] args)
	{
		print();
		st_nst_local_variable p1 = new st_nst_local_variable();
		p1.solution();
	}
}
