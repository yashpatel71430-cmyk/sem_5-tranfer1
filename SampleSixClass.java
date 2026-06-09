import java.util.Scanner;

class maximumGen
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
       System.out.println("maximum is "+ ans);
   }
}


public class SampleSixClass{

 public static void main(String[] args) {
     maximumGen s1=new maximumGen();
     s1.get();
     s1.show();
}
}