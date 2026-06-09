import java.util.Scanner;

class SquareGen
{
   int n; //Properties

   void get()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a NO :");
   n=sc.nextInt();
}
   void show() //methods

   {
       int ans=n*n; //local variable
       System.out.println("Square is "+ ans);
   }
}


public class SampleSecondClass{

 public static void main(String[] args) {
     SquareGen s1=new SquareGen();
     s1.get();
     s1,show();
}
}