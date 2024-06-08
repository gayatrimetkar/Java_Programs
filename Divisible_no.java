public class Divisible
{
	public static void main(String args[ ])
	{
		int a = Integer.parseInt(args[0]);
		if(a%3==0 & a%7==0)
		{
			System.out.println("The number is divisible by 3 and 7");	
		}
		else
		{
			System.out.println("The number is not divisible by 3 and 7");
		}	
	}
}