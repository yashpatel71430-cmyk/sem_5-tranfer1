import java.util.*;
class ExpSample1
{
     public static void main(String args[])
      {
          try
          {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter 2 Nos :");
              int x=sc.nextInt();
              int y=sc.nextInt();
              int ans=x/y;
              System.out.println("Division is " +ans);
          }

catch(ArithmeticException ex)
{
       System.out.println("Arithmetic Error "+ ex);
}
catch(InputMismatchException ex)
{
       System.out.println("Data Type Error "+ ex);
}


catch(Exception ex)
		{
				System.out.println(" Error "+ex);	
		}
		
		finally
		{
			System.out.println("Completed ");		
		}	
		System.out.println("Out of Block ");		

	}
}
  
