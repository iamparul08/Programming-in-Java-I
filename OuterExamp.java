//nonstatic inner class
class Outer
{
    class Inner
	{
		void if1()
		{
			System.out.println("if1");
		}
	}
}
public class OuterExamp
{
	public static void main(String args[])
	{
		Outer out = new Outer(); //object of outer class
		Outer.Inner o1 = out.new Inner(); //object of inner class
		o1.if1();
	}
}