package PractiseAbhitej;
public class Constructor2
{
	Constructor2 (int a)
	{
		int i = 5;
		int j = 10;
		int area = i*j;
		System.out.println(area);
	}
	Constructor2 (boolean d)
	{
		double d1=3.25;
		double d2=5.75;
		double add=d1+d2;
		System.out.println(add);
	}
public static void main(String[] args)
	{
		new Constructor2(50);
		new Constructor2(true);
	}
}
