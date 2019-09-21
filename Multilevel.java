//multilevel inheritance(no input needed)
class Person
{
  private int age;
  private String name;
  
  public void setAge(int a)
  { age = a; }
  public void setName(String n)
  { name=n; }   
  
  public int getAge()
   {return (age); }
  public String getName()
   {return (name); }
}
class Student1 extends Person
{
   private int rollno;
   public void setRollno(int r)
     {rollno = r; }
    public int getRollno()
     { return (rollno); }
}
class Multilevel
{
  public static void main(String[] args)
   {
     Student1 s=new Student1();
      s.setRollno(456);
      s.setName("Dolly");
      s.setAge(34);
      
      System.out.println("Roll no: "+s.getRollno());
      System.out.println("Name: "+s.getName());
      System.out.println("Age is: "+s.getAge());
   }
}
