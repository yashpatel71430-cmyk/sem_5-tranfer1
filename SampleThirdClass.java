import java.util.Scanner;

class AddGen
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
       int ans=x+y; //local variable
       System.out.println("Add is "+ ans);
   }
}


public class SampleThirdClass{

 public static void main(String[] args) {
     AddGen s1=new AddGen();
     s1.get();
     s1.show();
}
}