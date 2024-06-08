import java.util.Scanner;
public class Evenodd
{
	public static void main(String args[ ])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = obj.nextInt();
		if(x%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}
}
