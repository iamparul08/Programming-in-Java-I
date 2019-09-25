//after debugging
interface FamousLine
{
	void ShowLine();
	void AuthorName();
}
class Novel1 implements FamousLine
{
	public void ShowLine()
	{
		System.out.println("To be,or not to be");
	}
	public void AuthorName()
	{
		System.out.println("Shakespeare");
	}
}
class Novel2 implements FamousLine
{
	public void ShowLine()
	{
		System.out.println("To be,or not to be");
	}
	public void AuthorName()
	{
		System.out.println("Shakespeare");
	}
}
class UseInterface2
{
	public static void main(String []args)
	{
		Novel1 hamlet=new Novel1();
		Novel2 juliet=new Novel2();
		hamlet.ShowLine();
		juliet.AuthorName();
	}
}