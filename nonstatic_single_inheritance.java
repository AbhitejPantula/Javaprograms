package module2;
class parent_nonstatic
{
	void login()
	{
		System.out.println("Login to Facebook");
	}
	void logout()
	{
		System.out.println("Logout of Facebook");
	}
}
public class nonstatic_single_inheritance extends parent_nonstatic
{
	void testcase1()
	{
		System.out.println("Accept Friends");
	}
	public static void main(String[] args)
	{
		nonstatic_single_inheritance p1=new nonstatic_single_inheritance();
		nonstatic_single_inheritance p2=new nonstatic_single_inheritance();
		nonstatic_single_inheritance p3=new nonstatic_single_inheritance();
		p1.login();
		p2.testcase1();
		p3.logout();
	}
}
