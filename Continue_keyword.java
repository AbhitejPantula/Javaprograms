package module2;
public class Continue_keyword
{ //continue keyword skips the iteration and continues.
	public static void main(String[] args)
	{
		for (int i=1; i<=10; i++)
		{
		/*	if(i>3) //it skips the iteration after the i value = 3 
			{
				continue;
			} */
		/*	if(i>=3) //it skips the iteration after the i value is 2
			{
				continue;
			} */
		/*	if(i==5) //it skips the value 5 and then gives the iteration 
			{
				continue;
			} */
			if(i!=3) //it skips all the iteration and gives 3 as output
			{
				continue;
			}
		System.out.println(i);
		}
	}
}
