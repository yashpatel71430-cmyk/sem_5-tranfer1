import java.util.*;

interface shape
{
  final float pi=3.14f;
  public void area();
  public void vol();
}

class circle implements shape
{
   float r;
     void get()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter radius ::");
   r=sc.nextFloat();
}

//@override
public void area()
{
   float a=3.14f*r*r;
   System.out.println("Area is" +a);
}
//@override

public void vol()
{
   float v=4/3.0f*3.14f*r*r*r;
   System.out.println("vol is"+ v);
}
}
class rectangle implements shape
{
  int l,b,h;
     void get()
{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter L,B,H");
       l =sc.nextInt();
       b =sc.nextInt();
       h =sc.nextInt();
}
//@override
public void area()
{
   int a=l*b;
   System.out.println("Area is "+ a);
}
//@override
public void vol()
{
   int v=l*b*h;
   System.out.println("vol is " + v);
}
}
class ISample1
{
   public static void main(String args[])
   {
       shape s;
       rectangle r=new rectangle();
       circle c=new circle();
       r.get();
       c.get();
       // runtime polymorphism
       s=c; // reference object of circle
       s.area();
       s.vol();
       s=r; // reference object of rectangle
       s.area();
       s.vol();
}
}