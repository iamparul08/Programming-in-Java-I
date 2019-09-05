/**a program with multiple classes*/

class Room
{
 float length;
 float breadth;
 void getData(float a,float b)
  {
     length=a;
     breadth=b;
  }
}
class RoomArea
{
 public static void main(String args[])
 {
   float area;
   Room rooml=new Room();	//object created
   rooml.getData(14,10);
   area=rooml.length*rooml.breadth;
   System.out.println("Area= "+area);
 }
}