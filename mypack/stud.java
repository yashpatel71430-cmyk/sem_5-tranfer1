package mypack;

import java.util.*;

public class stud
{
    public int rno,fees;
    public String name;
    // overriding of cont
    public stud()  // default const
    {
         rno=0;
         fees=0;
         name="";
    }
public stud(int rno,String name,int fees) //par const
{
    this.rno=rno;
    this.name=name;
    this.fees=fees;
}
public void get()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rno, Name, Fees");
    rno=sc.nextInt();
    name=sc.nextLine();
    fees=sc.nextInt();
}
public void show()
{
     System.out.println(rno+"\t"+name+"\t"+fees);
}
}
