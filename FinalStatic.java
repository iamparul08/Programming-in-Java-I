public class FinalStatic
{
	private final int x;
	{ x=2; }
	private final static int y;
	static	//initialization block of static member variable
	{ y=4; }
	
	public static void main(String[] args)
	{
		FinalStatic fs=new FinalStatic();
		System.out.println("Value of x is: "+fs.x);
		System.out.println("Value of y is: "+fs.y);
	}
}