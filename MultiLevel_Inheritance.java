import java.util.*;

class stud
{
  int rno,fees;
  String name;
 //overloading of con
stud() //default con
{
   rno=0;
   fees=0;
   name="";
}

stud(int rno,String name,int fees) //par const
{

  this.rno=rno;
  this.name=name;
  this.fees=fees;
}
void get()
{

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter rno, name, fees");
  rno=sc.nextInt();
  name=sc.next();
  fees=sc.nextInt();
}

void show()
{
    System.out.println(rno+"\t"+name+"\t"+fees);
}

}

class exam extends stud
{
  int m1,m2,m3,tot;
  float per;
  exam()
{
  m1=m2=m3=tot=0;
 per=0.0f;
}

exam(int rno,String name,int fees,int m1,int m2,int m3)
{
   super(rno,name,fees); // calling the parameter const
this.m1=m1;
this.m2=m2;
this.m3=m3; // tot=per=0;
 // super.rno=44;
}
// overriding of methods
void get()
{
  super.get();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Mark1,Mark2,Mark3");
      m1=sc.nextInt();
      m2=sc.nextInt();
      m3=sc.nextInt();
}

void show()
{
   super.show();
   System.out.println(m1+"\t"+m2+"\t"+m3);
   tot=m1+m2+m3;
   per=tot/3.0f;
   System.out.println("\t"+tot+"\t"+per);
}
}
 
class scholarship extends exam
{
   float samt;
   scholarship()
   {
   }
  scholarship(int rno,String name,int fees,int m1,int m2,int m3)
   {
     super(rno,name,fees,m1,m2,m3); // calling the parameterized const.of parent class
   }
 
   void cal()
    {
      super.show();
      if (per>=70)
         System.out.println("scholarship amt is 10000");
      else
         System.out.println("no scholarship");
    }
}
class MultiLevel_Inheritance
{
	

	public static void main(String args[]) 
	{
		scholarship s1=new scholarship ();
		scholarship s2=new scholarship (22,"Neel",4000,60,60,70);
		
		s1.get();
		//s1.show();
		s1.cal();


		//s2.show();
		s2.cal();
	}
}


    

       
 


