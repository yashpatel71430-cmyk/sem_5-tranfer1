import java.util.*;
class stud
{
    int rno,marks;
    String name;
    stud()
{
    rno=0;
    marks=0;
    name="";
}
stud(int rno,String name,int marks)
{
   this.rno=rno;
   this.name=name;
   this.marks=marks;
}
void get()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Rno, Name , Marks");
   rno=sc.nextInt();
   name=sc.next();
   marks=sc.nextInt();
}

void display()
{
   System.out.println(rno+"\t"+name+"\t"+marks);
}
}

class BCA_paper_2025_3
{
  public static void main(String args[])
  {
    stud s1=new stud();
    s1.get();
    s1.display();
    stud s2=new stud();
    s2.get();
    s2.display();
}
}