public class Prime_no
{
	public static void main(String args[ ])
	{
		int n, i, f=0;
		n=Integer.parseInt(args[0]);
		for(i=2; i<n; i++)
		{	
		 	if(n%i==0)				
			{						
				f=1;
				break;			
			}
		}	
	if(f==1)
	System.out.println("not prime number");
	else
	System.out.println("prime number");
	}
}