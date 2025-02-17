package examprograms;

import java.util.Scanner;

public class calculator_addition
{
	static void calculatoradd()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first number n1 :");
		int n1 = s1.nextInt();
		System.out.println("Enter the first number n2 :");
		int n2 = s1.nextInt();
		System.out.println("Enter the first number n3 :");
		int n3 = s1.nextInt();
		System.out.println("Enter the first number n4 :");
		int n4 = s1.nextInt();
		int add = n1 + n2 + n3 + n4;
		System.out.println("Print the value : " + add);
		s1.close();
	}
	public static void main(String[] args)
		{
			calculatoradd();
		}
}