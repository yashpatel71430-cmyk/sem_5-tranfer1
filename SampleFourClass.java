import java.util.Scanner;

class divisionGen
{
   int x,y; //Properties

   void get()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a NO :");
   x=sc.nextInt();
   y=sc.nextInt();
}
   void show() //methods

   {
       int ans=x/y; //local variable
       System.out.println("division is "+ ans);
   }
}


public class SampleFourClass{

 public static void main(String[] args) {
     divisionGen s1=new divisionGen();
     s1.get();
     s1.show();
}
}