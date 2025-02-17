package module2;
public class Reversing_String
{
	public static void main(String[] args)
	{
		String input = "Suren";
		String output = "";
		for (int i = input.length()-1; i>=0; i--)
		{
		char c = input.charAt(i);
		output = output + c;
		}
		System.out.println("The given string is ->" + input);
		System.out.println("Reverse sting is ->" + output);
		if (input.equals(output))
		{
			System.out.println("The given string is Palindorme");
		}
		else
		{
			System.out.println("The given string is not a Palindrome");
		}
	}

}
