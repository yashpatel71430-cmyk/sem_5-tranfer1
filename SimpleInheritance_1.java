class Parent
{
   int x;
  // overloading of constructor
Parent()
{
   x=10;
}
Parent(int x)
{
  
   this.x=x;
 }
void show()
{
   System.out.println("I am Parent class");
}
}

class Child extends Parent
{
   int y;
// overloading of con
Child()
{
   y=20;
   super.x=55;
}
//overriding con
Child(int x,int y)
{
  super(x); // calling parameterized const of parent class
  this.y=y;
}
// overriding
void show()
{
  super.show();
  System.out.println("I am overriding Parent class"+x);
   System.out.println("value of y"+y);
}
 void childshow()
{
   System.out.println("I am child show");
}
}
 
public class SimpleInheritance_1 {
  public static void main(String[] args)
 {
   Child c1=new Child(100,200);
   c1.show();
   c1.childshow();
}
} 
 