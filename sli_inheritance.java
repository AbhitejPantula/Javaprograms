package module2;
class parentinheritance 
{
	static void login()
	{
		System.out.println("Login");
	}
	static void logout()
	{
		System.out.println("Logout");
	}
}
public class sli_inheritance extends parentinheritance
{
	static void searchcase1()
	{
		System.out.println("Search any product");
	}
public static void main(String[] args)
{
	login();
	searchcase1();
	logout();
}
}