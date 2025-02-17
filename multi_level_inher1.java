package module2;
class grandparent
	{
		static void login()
		{
			System.out.println("Login to amazon");
		}
		static void amazonauth()
		{
			System.out.println("Enter the amazon account password");
		}
	}
class parent extends grandparent
	{
		static void amazonsearch()
		{
			System.out.println("Search a product of your choice");
		}
	}
public class multi_level_inher1 extends parent
{
	static void logout()
	{
		System.out.println("Logout from amazon");
	}
	public static void main(String[] args)
	{
		login();
		amazonauth();
		amazonsearch();
		logout();
	}
}
