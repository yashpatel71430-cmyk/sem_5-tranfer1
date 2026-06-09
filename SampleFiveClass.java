import java.util.Scanner;

class subtractionGen
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
       System.out.println("subtraction is "+ ans);
   }
}


public class SampleFiveClass{

 public static void main(String[] args) {
     subtractionGen s1=new subtractionGen();
     s1.get();
     s1.show();
}
}