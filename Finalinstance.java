//dated: Sept 12,2019 by Parul Mathur
//final instance member variable

public class Finalinstance
{
	private final int x;	//final instance member variable
	{ x=5; }	//initialization block
	public static void main(String[] args)
	{
		Finalinstance f1=new Finalinstance();
		System.out.println("value of x is: "+f1.x);
	}
}