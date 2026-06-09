import java.util.*;
abstract class SampleAbs
{
    abstract void check();
    void show()
{
     System.out.println(" Show from shape");
 
}
}
 
class child extends SampleAbs
{
   void check()
{
    System.out.println("I am Child Class");
}
}

class AbstSample_basic
{
   public static void main(String args[])
  {
     child c=new child();
     SampleAbs s;
     c.check();
     c.show();
     s=c; // s is reference object of class child
     s.check();
     s.show();
}
}
