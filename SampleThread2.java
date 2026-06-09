class Thd extends Thread
{
   int slp;
   Thd(String name,int p,int sleep)
   {
   setName(name);
   setPriority(p);
   this.slp=sleep;
   // start();
}

public void run()
{
   try
   {
   for (int i=1;i<=5;i++)
    {
      System.out.println("Thread executed " +getName() +" =>" + i);
      Thread.sleep(slp);
    }
}

catch(InterruptedException ex)
{

    System.out.println(ex);
}
}
}

public class SampleThread2 {
   public static void main(String[] args) {
     Thd t1=new Thd("BcA", 5, 1000);
     Thd t2=new Thd("MCA", 5, 1000);
     t1.start();
     t2.start();
 
      try
      {
        for (int i=10;i<=15;i++)
        {
           System.out.println("Main "+ i);
           Thread.sleep(100);  
        }
     }
     catch(InterruptedException ex)
      {
         System.out.println(ex);
      }
}
}
 