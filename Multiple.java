//implementing multiple inheritance through interface
class Student
{
	int rollNO;
	void getNum(int n)
	{
		rollNO=n;
	}
	void putNo()
	{
		System.out.println("Roll no is: "+rollNO);
	}
}
class Test extends Student
{
	float part1,part2;
	void getMarks(float m1,float m2)
	{
		part1=m1;
		part2=m2;
	}
	void putMarks()
	{
		System.out.println("Marks obtained");
		System.out.println("Part1: "+part1);
		System.out.println("Part2: "+part2);
	}
}
interface Sports
{
	float sportWt=6.0f;
	void putWt();
}
class Results extends Test implements Sports
{
	float total;
	public void putWt()
	{
		System.out.println("Sports Wt:"+sportWt);
	}
	void display()
	{
		total=part1+part2+sportWt;
		putNo();
		putMarks();
		putWt();
		System.out.println("Total score: "+total);
	}
}
class Multiple
{
	public static void main(String []args)
	{
		Results r1=new Results();
		r1.getNum(123);
		r1.getMarks(90.0f,89.3f);
		r1.display();
	}
}
