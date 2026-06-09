class Thd2 implements Runnable
{
   Thread t1=new Thread(this);
   Thd2(String name,int p)
   {
   t1.setName(name);
   t1.setPriority(p);
   t1.start();
}

public void run()
{
   try
   {
   for (int i=1;i<=5;i++)
    {
      System.out.println("value" +i + t1.getName());
      Thread.sleep(500);
    }
}

catch(InterruptedException ex)
{

    System.out.println(ex);
}
}
}

public class SampleThread {
   public static void main(String[] args) {
    try
{
     Thd2 t1=new Thd2("Chd1", 2);
     Thd2 t2=new Thd2("Chd2", 10);
 
        for (int i=20;i<=25;i++)
        {
           System.out.println("Main "+ i);
           Thread.sleep(1000);  
        }
     }
     catch(InterruptedException ex)
      {
         System.out.println(ex);
      }
}
}
 