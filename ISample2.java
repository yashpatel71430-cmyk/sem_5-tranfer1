import java.util.*;

interface A
{
   public void methodA();
}

interface B
{
    public void methodB();
}

//multiple inheritance
class C implements A,B
{
  //@override
    public void methodA()
    {
        System.out.println("methodA implemented ");
}
 public void methodB()
{
     
   System.out.println("method implemented");
}
}

class ISample2
{
  public static void main(String Args[])
{
   C objc=new C();
   objc.methodA();
   objc.methodB();

   A obja=objc;
   obja.methodA();

   B objb=objc;
   objb.methodB();
}
}