//sleep() method
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("From threadA: i"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception caught");
		}
	}
}
class SleepMthd
{
	public static void main(String[] args)
	{
		A a = new A();
		a.start();
	}
}