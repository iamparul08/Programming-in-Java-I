//hierarchical inheritance
import java.util.Scanner;
class College
{
	private int rollno;
	protected int m1,m2,m3,m4,m5;
	
	void input()
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the rollno: ");
		rollno = inp.nextInt();
		System.out.println("Enter the five subjects marks: ");
		m1 = inp.nextInt();
		m2 = inp.nextInt();
		m3 = inp.nextInt();
		m4 = inp.nextInt();
		m5 = inp.nextInt();
	}
}
class Btech extends College
{
	private int t;
	private float p;
	
	void result()
	{
		t = m1+m2+m3+m4+m5;
		p=t*100/500;
		System.out.println("Total marks= "+t);
		System.out.println("Percentage is= "+p);
	}
}
class BCA extends College
{
	private int t;
	private float p;
	
	void result()
	{
		t = m1+m2+m3+m4+m5;
		p=t*100/500;
		System.out.println("Total marks= "+t);
		System.out.println("Percentage is= "+p);
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Btech b = new Btech();
		b.input();
		b.result();
		
		BCA c = new BCA();
		c.input();
		c.result();
	}
}

