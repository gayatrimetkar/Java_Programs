public class Arith
{
	public static void main(String args[ ])
	{
	    int a=Integer.parseInt(args[0]);
	    int x=Integer.parseInt(args[1]);
	    int y=Integer.parseInt(args[2]);
	    int c;
	    switch(a)
		{	
		case 1:
			System.out.println("addition is" +(x+y));
			break;
		case 2:
			System.out.println("substraction is" +(x-y));
			break;
		case 3:
			System.out.println("substraction is" +(x*y));
			break;
		case 4:
			System.out.println("substraction is" +(x/y));
			break;
		default :
			System.out.println("Not selected");
		}	
	}
} 