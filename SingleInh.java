//single level inheritance
class Person
{
	private int age;
	private String name;
	public void setAge(int a)
	{age = a;}
	public void setName(String n)
	{name = n;}
	public int getAge()
	{return (age);}
	public String getName()
	{return(name);}
}
class Student extends Person
{
	private int rollno;
	public void setRollno(int r)
	{rollno = r;}
	public int getRollno()
	{return(rollno);}
}
public class SingleInh
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setRollno(100);
		s1.setName("Rahul");
		s1.setAge(20);
		System.out.println("Roll no: "+s1.getRollno());
		System.out.println("Name: "+s1.getName());
		System.out.println("Age: "+s1.getAge());
	}
}