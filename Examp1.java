//displaying rollno, name, age of a student
public class Examp1
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