//anonymous class
class Greeting
{
	public void sayHello()
	{
		System.out.println("Hello");
	}
}
class India
{
	Greeting g = new Greeting()
	{
		public void sayHello()
		{
			System.out.println("Hola");
		}
	};
}
public class Anonymous
{
	public static void main(String args[])
	{
		India india = new India();
		india.g.sayHello();
	}
}