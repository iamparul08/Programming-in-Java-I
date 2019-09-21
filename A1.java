//use of super(), this()
class A
{
	int z;
	public void f1()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	int z;
	public void f1()
	{
		super.f1();
		System.out.println("Class B");
	}
	public void f2()
	{
		int z;
		z=2;
		this.z=3;
		super.z=4;
	}
}
class A1
{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.f1();
		obj.f2();
		System.out.println("Main class");
	}
}