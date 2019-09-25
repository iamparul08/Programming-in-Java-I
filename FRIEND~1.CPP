//Overloading unary operator using friend function
#include<iostream.h>
#include<conio.h>
//using namespace std;
class Unary
{
 private:
  int a,b,c;
 public:
  void getvalues(int x,int y,int z)
   { a=x;b=y;c=z; }
  void show()
  {
      cout<<"Values of a, b & c\n";
      cout<<a<<"\n"<<b<<"\n"<<c<<"\n"<<endl;
  }
  void friend operator-(Unary &x);      //Pass by reference
};
void operator-(Unary &x)
{
     x.a = -x.a;   //Object name must be used as it is a friend function
     x.b = -x.b;
     x.c = -x.c;
}
void main()
{
     clrscr();
     Unary x1;
     x1.getvalues(40,50,60);
     cout<<"Before Overloading\n";
     x1.show();
     cout<<"After Overloading \n";
     -x1;
      x1.show();
      getch();
}