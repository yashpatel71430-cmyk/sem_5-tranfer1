import java.util.*;

abstract class Consumer
{
	int units;
	abstract void calculateBill();
	double billamt;
	
}
class Domestic extends Consumer
{
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of units : ");
		units=sc.nextInt();
	}
	void calculateBill()
	{
		if(units <= 100)
		{
			billamt = units * 3;
		}
		else
		{
			billamt = (100 * 3) + ((units-100) * 5);
		}
		System.out.println("Revenue is : " + billamt);
	}
}

class Commercial extends Consumer
{
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of units : ");
		units=sc.nextInt();
	}
	void calculateBill()
	{
		billamt = units * 8;
		System.out.println("Revenue is : " + billamt);
	}
}

class Sample24
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Domestic[] d1=new Domestic[10];
		Commercial[] c1=new Commercial[10];
		int ch=0,n=0,n1=0;
		do

		{
		System.out.println("============consumer choice===========");
		System.out.println("1. Domestic");
		System.out.println("2. Commercial");
		System.out.println("3. Exit");
		System.out.println("Enter ur choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1 : 
			System.out.println("Enter no of domestic consumers : ");
		        n=sc.nextInt();
		         for(int i=0;i<n;i++)
		        {
			d1[i]=new Domestic();
			System.out.println("Enter data for user " + (i+1));
			d1[i].input();
			
			
		         }
		         for(int i=0;i<n;i++)
		         {	
			System.out.println("=========Bill Of Domestic Consumer " + (i+1) + "======" );
			System.out.println();
			d1[i].calculateBill();
		         }
			
			break;
		
			case 2 : 
			System.out.println("Enter no of Commercial consumers : ");
		        n1=sc.nextInt();
		         for(int i=0;i<n1;i++)
		        {
			c1[i]=new Commercial();
			System.out.println("Enter data for user " + (i+1));
			c1[i].input();
			
			
		         }
		         for(int i=0;i<n1;i++)
		         {	
			System.out.println("=========Bill Of Commercial Consumer " + (i+1) + "======" );
			System.out.println();
			c1[i].calculateBill();
		         }
			break;

			case 3:
			System.out.println("Exiting.....");
			break;

			default:
			System.out.println("Invalid choice");
			
		}
		}while(ch != 3);
		
	}
}