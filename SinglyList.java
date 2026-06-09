import java.util.*;
//self referential classes
class Node 
{
    int no;
    Node nt;
}
class LinkList
{
Node start,last;
LinkList()
{
    start=null;    last=null;
}

void create()
{
    Node nnode;
    Scanner sc=new  Scanner(System.in);
    while (true)
    {
        System.out.println("Enter your No");
        int n=sc.nextInt();
        if (n==0)
            break;
        nnode =new  Node();
        nnode.no=n;
        nnode.nt=null;
       if (start==null)
        {
            start=last=nnode;
        }
        else
        {
            last.nt=nnode;
            last=nnode;
        }
    }
}
void display()
{
    for (Node t=start;t!=null;t=t.nt)
    {
        System.out.print(t.no + " \t");
    }
}
void countNodes()
{
    int cnt=0;
    for (Node t=start;t!=null;t=t.nt)
    {
        cnt++;
    }
        System.out.print("Total Nodes \t"+cnt);
}

 public void maxNode() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        int max = start.no;
        for (Node t=start;t!=null;t=t.nt)
        {
            if (t.no > max)
                max = t.no;
           
        }
        System.out.println("\nMax in List: " + max);
    }

    
    public void minNode() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        int min = start.no;
        for (Node t=start;t!=null;t=t.nt)
        {
            if (t.no < min)
                min = t.no;
           
        }
        System.out.println("\nMin in List: " + min);
    }
  public void sumNode() {
        int sum = 0;
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        for (Node t=start;t!=null;t=t.nt)
        {
           
           sum+=t.no; //sum+=a[i]
           
        }
        System.out.println("\nSum of List: " + sum);
    }

     public void searchNode(int skey ) {
        boolean flag = false;
        int cnt =0;
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        for (Node t=start;t!=null;t=t.nt)
        {
         if (t.no==skey)
         {
            flag=true;
            cnt++;
         }
        }
        if (flag ==false)
            System.out.println("\nNot found " + skey);
        else
            System.out.println("\n found " + cnt + " times");
      
    }
      
    public void insertAtBegin() {
        System.out.print("\nEnter n: ");
        Scanner sc=new  Scanner(System.in);
    
        int n = sc.nextInt();
        Node newNode = new Node();
        newNode.no=n;
        if (start == null) {
            start = last = newNode;
        } else {
            newNode.nt = start;
            start = newNode;
        }
    }

    public void insertAtEnd() {
        System.out.print("\nEnter n: ");
        Scanner sc=new  Scanner(System.in);
    
        int n = sc.nextInt();
        Node newNode = new Node();
        newNode.no=n;

        if (start == null) {
            start = last = newNode;
        } else {
            last.nt = newNode;
            last = newNode;
        }
    }

    public void deleteAtBegin() {
        if (start == null) {
            System.out.println("\nList is Empty");
            return;
        }
        System.out.println("\nDeleted Node: " + start.no);
        start = start.nt;
    }

    public void deleteAtEnd() {
        if (start == null) {
            System.out.println("\nList is Empty");
            return;
        }
        if (start.nt == null) {
            System.out.println("\nDeleted Node: " + start.no);
            start = last = null;
            return;
        }
        Node t;
        for ( t=start;t.nt!=last;t=t.nt)
        {
           
          
        }
        System.out.println("\nDeleted Node: " + last.no);
        last = t;
        last.nt = null;
    }
}

public class SinglyList {
    public static void main(String[] args) {
        LinkList lst=new LinkList();
        Scanner sc=new  Scanner(System.in);
    
int ch=0;
while (ch!=12)
{
    System.out.print("\n1.Create ");
    System.out.print("\n2.Display ");
    System.out.print("\n3.Count ");
    System.out.print("\n4.Find Max ");
    System.out.print("\n5.Find Min ");
    System.out.print("\n6.Find Sum ");
    System.out.print("\n7.Search  ");
   System.out.print("\n8.Insert At Begin ");
    System.out.print("\n9.Insert At End");
    System.out.print("\n10.Delete At Begin");
    System.out.print("\n11.Delete At End");
    System.out.print("\n12.Exit ");
  
    System.out.print("\nEnter your choice :: ");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1:
               lst.create();
                break;
        case 2:
                lst.display();
                break;
         case 3:
                lst.countNodes();
                break;    
        case 4:
                lst.maxNode();
                break;   
         case 5:
                lst.minNode();
                break;           
         case 6:
                lst.sumNode();
                break;    
                
        case 7:
             System.out.print("\nEnter Data to Search ");
             int skey=sc.nextInt();
                lst.searchNode(skey);
                break; 
                     
         case 8:
                lst.insertAtBegin();
                break;       
        case 9:
                lst.insertAtEnd();
                break;                       
        case 10:
        lst.deleteAtBegin();
                break;            
        case 11:
        lst. deleteAtEnd();
                break;   
    }        
   }
}
}