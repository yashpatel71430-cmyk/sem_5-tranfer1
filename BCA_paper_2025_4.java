class Thd extends Thread
{
   String msg;
   Thd(String msg)
   {
 
     this.msg=msg;
     start();

   }
   public void run()
    {
      try
      {
         for (int i=1;i<=5;i++)
         {
            System.out.println(msg);
            Thread.sleep(500);
         }
}
   catch(InterruptedException ex)
{

   System.out.println(ex);
}
}
}

public classc
{
  public static void main(String[] args) 
{
   Thd t1=new Thd("Hello From Thread");
}
}
