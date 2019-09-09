package pack1;
import pack2.Student;

public class Example1
{
  public static void main(String[] args)
   {
     Student s1=new Student();
     s1.setRollno(100);
     s1.setName("Parul");
     System.out.println("Roll no: "+s1.getRollno());
     System.out.println("Name: "+s1.getName());
   }
}