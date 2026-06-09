import java.util.Scanner;

class MyCircle 
{
   float r;
   //overloading of constructor 
   MyCircle() // default
   {
       r=3;
   }
   MyCircle(float r) // parameterlized
   {
       this.r=r;
   }
   void get()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter radius");
      r=sc.nextFloat();
   }
    float area()
    {
         float a=3.14f*r*r;
         return a;
    }
    float circumference()
    {
        float c=2*3.14f*r;
        return c;
    }
 }
 public class CircleClass {
 public static void main(String[]args) {
 MyCircle c=new MyCircle();
 float a=c.area();
 System.out.println("Area is"+ a);
 float ci=c.circumference();
 System.out.println("Circumference is"+ ci);

 
 MyCircle c3=new MyCircle(5);
 System.out.println("Area is "+ c3.circumference());
 System.out.println("Circumference is"+ c3.circumference());
}
}