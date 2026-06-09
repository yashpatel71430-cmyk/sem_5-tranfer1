import java.util.*;

 final class Test
{
final void show()
{
   System.out.println("Hello ..");
}
}

/*class Test2 extends Test
{
   // overriding
   // void show()
   // {
   // System.out.println("Hello from Test2 ...")
   // }
 }*/
 
class FinalMethod
{
   public static void main(String args[])
   {
      final int x=10;
      int y=x+30;
      System.out.println("x is "+x);
      System.out.println("y is "+y);
      //x++;
      Test t1=new Test();
      t1.show();
      Test2 t2=new Test2();
      t2.show();
}
}