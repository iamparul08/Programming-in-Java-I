//static inner class
class Outer
{
    static class Inner
	{
		void if1()
		{
			System.out.println("if1");
		}
	}
}
public class Outer2
{
	public static void main(String args[])
	{
		Outer.Inner o1 = new Outer.Inner(); //object of inner class
		o1.if1();
	}
}