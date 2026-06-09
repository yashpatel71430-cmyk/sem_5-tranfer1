import java.util.*;

//userdefined or custom exception

class InvalidName extends Exception
{
    public String toString ()
    {
       return "Name is Invalid Min 3 Characters";
    }
}
class InvalidAge extends Exception
{
    public String toString ()
    {
       return "Age should be < 20";
    }
}
class ExpSample2
{
   public static void main(String args[])
    {
       try
        {
          Scanner sc = new Scanner(System.in);
          System.out.println(sc);

          System.out.println("Enter Name and Age :");
          String st =sc.next();
          if (st.length()<3)
             throw new InvalidName();
  
          int age=sc.nextInt();
          if (age>20)
             throw new InvalidAge();
}
catch(InvalidName ex)
		{
				System.out.println(ex);	
		}
		catch(InvalidAge ex)
		{
				System.out.println(ex);	
		}
		catch(InputMismatchException ex)
		{
				System.out.println("Data Type Error "+ex);	
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

          
  
   