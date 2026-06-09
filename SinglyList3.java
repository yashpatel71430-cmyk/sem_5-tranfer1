import java.util.*;
//self referential classes
class Node 
{
    String no;
    Node nt;
}
class LinkList
{
Node start,last;
LinkList()
{
    start=null;   
    last=null;
}


    public void insertAtEnd() {
        System.out.print("\nEnter n: ");
        Scanner sc=new  Scanner(System.in);
    
        String n = sc.next();
        Node newNode = new Node();
        newNode.no=n;

        if (start == null) {
            start = last = newNode;
        } else {
            last.nt = newNode;
            last = newNode;
        }
    }


void display()
{
    for (Node t=start;t!=null;t=t.nt)
    {
        System.out.print(t.no + " \t");
    }
}
}

  public class SinglyList3
{
    public static void main(String[] args)
 {
        LinkList lst=new LinkList();
        Scanner sc=new  Scanner(System.in);
    
int ch=0;
while (ch!=3)
{
    System.out.print("\n1.Insert At End ");
    System.out.print("\n2.Display ");
    System.out.print("\n3.Exit ");
    System.out.print("\nEnter your choice :: ");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1:
               lst.insertAtEnd();
                break;
        case 2:
                lst.display();
                break;
        case 3: 
                System.out.println("Existing");
                break;
            } 
}  
}
}
  
   

