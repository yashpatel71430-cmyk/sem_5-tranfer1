import java.util.*;
class stud
{
   int rno,fees;
   String name;
   stud() // default  con
{
   rno=0;
   fees=0;
   name="";
}
  
 stud(int rno,String name,int fees) // par const
 {
   this.rno=rno;
   this.name=name;
   this.fees=fees;
 }
  void get()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Rno,Name,Fees");
   rno=sc.nextInt();
   name=sc.next();
   fees=sc.nextInt();
}
 void show()
{ 
  System.out.println(rno+"\t"+name+"\t"+fees);
}
}

class SampleClass2
{
  public static void main(String args[])
  {
    stud s1=new stud(1,"aa",4400); // object creation
    s1.show();
    stud []s=new stud[5]; // array of object
    for (int i=0;i<s.length;i++)
 {
   s[i]=new stud();
   s[i].get();
 }
 for (stud t:s) //foeeach loop
 {
   t.show();
 }
}
}



