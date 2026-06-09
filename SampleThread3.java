import java.util.*;
public class SampleThread3 {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);

             System.out.println("Enter your Name" );
             String st=sc.nextLine();
            try{
                for (int i=0;i<st.length();i++)
                {
                    System.out.println(st.charAt(i));
                    Thread.sleep(1000);
                 }

}
 catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
            
        }
    }
}