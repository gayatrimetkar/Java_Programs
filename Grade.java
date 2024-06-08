public class Grade
{
	public static void main(String args[])
	{
		int n= Integer.parseInt(args[0]);
		if(n>=90)
		{
			System.out.println("Grade is A");
		}
		else if(n>=80 && n<=89) 
		{
			System.out.println("Grade is B");
		}
		else if(n>=70 && n<=79) 
		{
			System.out.println("Grade is C");
		}
		else if(n>=60 && n<=69) 
		{
			System.out.println("Grade is D");
		}
		else 
		{
			System.out.println("Grade is F");
		}				
	}
}