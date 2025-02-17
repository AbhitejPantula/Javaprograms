package examprograms;
public class vote_female_condition
{	
	//vote age = 18 and condition sex = female then vote
		static void vote()
	{
		int i = 21;
		String gender = "Female";
		if (i>=18 && (gender=="Female"))
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}
	}
	public static void main(String[] args)
	{
		vote();
	}
}
