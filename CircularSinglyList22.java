import java.util.*;
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
void display()
{
    for (Node t=start;t!=null;t=t.nt)
    {
        System.out.print(t.no + " \t");
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
}

public class SinglyListp1 {
    public static void main(String[] args) {
        LinkList lst=new LinkList();
        Scanner sc=new  Scanner(System.in);
    
int ch=0;
while (ch!=3)
{
    System.out.print("\n1.display ");
    System.out.print("\n2.insert at end ");
    System.out.print("\n3.Exit ");
    System.out.print("\nEnter your choice :: ");
    ch=sc.nextInt();
    switch(ch)
    {

	case 1:
                lst.display();
                break;

	case 2:
                lst.insertAtEnd();
                break;  
		}
		}
	}
}