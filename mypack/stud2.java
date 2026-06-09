package Mypack;

import java.util.*;



 class stud2
{
	public int rno,fees;
	public String name;
	//Overloading of Constructors.
	 stud2()  //default Constructor 
	{
		rno=0;
		fees=0;
		name="";
	}
	 stud2(int rno,String name,int fees)  //par const
	{
		this.rno=rno;
		this.name=name;
		this.fees=fees;
	}
	 void get()
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Rno ,Name, Fees");
		rno=sc.nextInt();
		name=sc.nextLine();
		fees=sc.nextInt();
	}
	 void show()
	{
		System.out.println(rno+"\t"+name+"\t"+fees);
	}
	
}
public class exam extends stud2
{

public int m1,m2,m3,tot;
public float per;
public exam()
{
	m1=m2=m3=tot=0;
	per=0.0f;
}

public exam(int rno,String name,int fees,int m1,int m2,int m3)
{
	super(rno,name,fees); // calling the parameterized const. of parent class
	this.m1=m1;
	this.m2=m2;
	this.m3=m3; //tot=per=0;
	//super.rno=44;
}
//Overriding of Methods 
public void get()
{
super.get();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Mark1,Mark2,Mark3");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();

}

public	void show()
	{
		super.show();
		System.out.println(m1+"\t"+m2+"\t"+m3);
		tot=m1+m2+m3;
		per=tot/3.0f;
		System.out.println("\t"+tot+"\t"+per);
		
	}

}