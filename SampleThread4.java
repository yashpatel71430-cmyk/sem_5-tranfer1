import java.util.*;
public class SampleThread4 {
   public static void main(String[] args) {
     try
     {
          while (true) {
             Date d=new Date();
             System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds() );
             Thread.sleep(1000);
}
}
 catch(InterruptedException ex)
        {
            System.out.println(ex);
            
        }
    }
}