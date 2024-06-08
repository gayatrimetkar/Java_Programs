public class Temperature
{
	public static void main(String args[])
	{
		int choice = Integer.parseInt(args[0]);
		double temperature;
		switch(choice)
		{
			case 1:
				temperature = Integer.parseInt(args[1]);
				double celsius = (temperature-32)*5/9;
				System.out.println("Temperature in Celsius:" +celsius);
				break;
			case 2:
				temperature = Integer.parseInt(args[2]);
				double fahrenheit = (temperature*9/5)+32;
				System.out.println("Temperature in Fahrenheit:" +fahrenheit);
				break;
			default:
				System.out.println("Invalid choice");
				

		}
	}
}