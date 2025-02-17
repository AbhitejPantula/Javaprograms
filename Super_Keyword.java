package PractiseAbhitej;
class parent
{
	void add()
	{
		System.out.println("Add the number");
	}
}
public class Super_Keyword extends parent
{
	void add()
	{
		super.add();
		System.out.println("Add the number");
	}
	public static void main(String[] args)
	{
		Super_Keyword p1 = new Super_Keyword();
		p1.add();
	}
}