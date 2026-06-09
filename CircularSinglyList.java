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
     last.nt=start;
}
void display()
{
    Node t=start;
    do
    {
        System.out.print(t+"\t"+t.no + "\t" + t.nt);
        t=t.nt;
    }while (t!=start);
}



void countNodes()
{
   int count = 0;
    Node t=start;
    do
    {
        System.out.print(t.no + "\t" );
        t=t.nt;
        count+=1;
    }while (t!=start);
     System.out.println("\nTotal Nodes: " + count);

}

 public void maxNode() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        int max = start.no;
        Node t=start;
        do 
        {
            if (t.no > max)
                max = t.no;
            t=t.nt;
           
        }while(t!=start);
        System.out.println("\nMax in List: " + max);
    }

    
    public void minNode() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        int min = start.no;
         Node t=start;
        do 
        {
            if (t.no > min)
                min = t.no;
            t=t.nt;
           
        }while(t!=start);
        System.out.println("\nMin in List: " + min);
    }
  public void sumNode() {
        int sum = 0;
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        Node t=start;
        do 
        {
           
           sum+=t.no; //sum+=a[i]
           t=t.nt;
        }while(t!=start);
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
        last.nt=start;
    }

    public void insertAtEnd() {
        System.out.print("\nEnter n: ");
        Scanner sc=new  Scanner(System.in);
    
        int n = sc.nextInt();
        Node newNode = new Node();
        newNode.no=n;
        newNode.nt=start;

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
        last.nt=start;
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
        last.nt = start;
    }
}

public class CircularSinglyList {
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