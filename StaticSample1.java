class Test
{
   static int x;
   int a;
static
{
   System.out.println("I am a static block");
}
  Test()
{
    a=10;
    System.out.println("I am a Constructor");
}
void change()
{
   x++;
   a++;
   System.out.println("Value of X"+ x);
   System.out.println("Value of A" + a);
}
static void findstatus()
{
   System.out.println("Current value of x is "+x);
}
}

class StaticSample1
{
   public static void main(String args[]){
    Test t1=new Test();
    t1.change();
    Test t2=new Test();
    t2.change();
    Test t3=new Test();
    t3.change();
      t3.findstatus();
      Test.findstatus();
       // Test2.change();
}
}
