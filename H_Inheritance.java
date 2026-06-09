import java.util.*;

class emp
{
	int eno,sal;
	String name;
	//Overloading of Constructors.
	emp()  //default Constructor 
	{
		eno=0;
		sal=0;
		name="";
	}
	emp(int eno,String name,int sal)  //par const
	{
		this.eno=eno;
		this.name=name;
		this.sal=sal;
	}
	void get()
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Eno , Name,Salary");
		eno=sc.nextInt();
		name=sc.next();
		sal=sc.nextInt();
	}
	void show()
	{
		System.out.println(eno+"\t"+name+"\t"+sal);
	}
}
class PartTime extends emp{
int days;
float netsal;
PartTime()
{
	days=0;
	netsal=0.0f;
}
PartTime(int eno,String name,int sal,int days)
{
	super(eno,name,sal); // calling the parameterized const. of parent class
	this.days=days;
	
}
//Overriding of Methods 
void get()
{
		super.get();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Working Days ");
		days=sc.nextInt();
}

	void show()
	{
		super.show();
		System.out.println("Days Worked "+ days);
		netsal=days*sal/30;
		System.out.println("Net Salary "+netsal);
		
	}
}
 class FullTime extends emp
{
float  hra,da,pf,netsal;
FullTime()
{

	hra=da=pf=netsal=0.0f;
}

FullTime(int eno,String name,int sal)
{
	super(eno,name,sal); // calling the parameterized const. of parent class
		
}

	void show()
	{
		super.show();
		hra=0.30f*sal;
		da=0.15f*sal;
		pf=0.10f*sal;
		netsal=sal+hra+da-pf;
		System.out.println("Net Salary "+netsal);
		
	}

}
class H_Inheritance
{
	

	public static void main(String args[]) 
	{
		FullTime f1=new  FullTime();
		f1.get();
		f1.show();

		PartTime p1=new  PartTime();
		p1.get();
		p1.show();

		FullTime t1=new FullTime(11,"ZA" , 67000);
		t1.show();

		PartTime p11=new  PartTime(12, "aa", 78000, 20);
p11.show();
	}
}