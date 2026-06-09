package mypack;

import java.util.*;


public class rect
{
	int l,b,h;  //properties
	//Overloading of Constructors.
	public rect()  //default Constructor 
	{
		l=b=h=0;
	}

	
	public rect(int t) //para constr
	{
		l=b=h=t;
	}
	
	public  rect (int l,int b,int h)  //par const
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	public  void get()
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter l,b,h");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
	}

	
	public  void area()
	{
		int a=l*b;
		System.out.println("Area "+ a);
	}

	public 	int vol()
	{
		return l*b*h;
	}
}


// class circle -> get,area,vol,circumference  (r)
// a=pi*r*r
// c=2*pi*r
// v=4/3.0f* pi*r*r*r