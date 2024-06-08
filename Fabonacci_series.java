public class Fabonacci
{
	public static void main(String args[])
	{
		int i=1, n=10, fn=0, sn=1;
		while(i<=n)
		{
			System.out.println(fn);
			int nextno=fn+sn;
			fn=sn;
			sn=nextno;
			i++;
		}
	}

}