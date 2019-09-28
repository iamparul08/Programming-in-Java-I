//illustration of run-time errors
class Excep1H
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		int c=5;
		int x,y;
		try
		{
			x=a/(b-c);	//exception here
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero");
		}
		y=a/(b+c);
		System.out.println("y= "+y);
	}
}