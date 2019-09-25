//after debugging the code
interface NewShape
{
	void showRadius();
}
interface Circle extends NewShape
{
	void showArea();
	int radius=10;
	double area=314;
}
class NewCircle implements Circle
{
	public void showRadius()
	{
		System.out.println("Radius of circle is: "+(radius));
	}
	public void showArea()
	{
		System.out.println("Area of circle is: "+(area));
	}
}
class Interface3 extends NewCircle
{
	public static void main(String []args)
	{
		NewCircle nc=new NewCircle();
		nc.showRadius();
		nc.showArea();
	}
}