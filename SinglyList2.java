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
		start=null;
		last=null;
	}
	
	void create()
	{
		Node nnode;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter your no : ");
			int n=sc.nextInt();
			if(n==0)
				break;
			nnode=new Node();
			nnode.no=n;
			nnode.nt=null;
			if(start==null)
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
		for(Node t=start;t!=null;t=t.nt)
		{
			System.out.print(t.no + "\t");
		}
	}

	void countNodes()
	{
		int cnt=0;
		for(Node t=start;t!=null;t=t.nt)
		{
			cnt++;
		}
		System.out.println("Total nodes : " + cnt);

	}
	public void maxNode()
	{
		if(start==null)
		{
			System.out.println("Link is empty");
			return;
		}
		int max=start.no;
		for(Node t=start;t!=null;t=t.nt)
		{
			if(t.no>max)
				max=t.no;
		}
		System.out.println("Sum of list : " + max);
	}

	public void minNode()
	{
		if(start==null)
		{
			System.out.println("Link is empty");
			return;
		}
		int min=start.no;
		for(Node t=start;t!=null;t=t.nt)
		{
			if(t.no<min)
				min=t.no;
		}
		System.out.println("Min of list : " + min);
	}
	public void sumNode()
	{
		int sum=0;
		if(start==null)
		{
			System.out.println("Link is empty");
			return;
		}
		
		for(Node t=start;t!=null;t=t.nt)
		{
			sum += t.no;
		}
		System.out.println("Sum of list : " + sum);
	}
	public void searchNode(int skey)
	{
		boolean flag=false;
		int cnt=0;
		if(start==null)
		{
			System.out.println("List is empty ");
			return;
		}
		for(Node t=start;t!=null;t=t.nt)
		{
			if(t.no==skey)
			{
				flag=true;
				cnt++;
			}
			
		}
		if(flag == false)
		{
			System.out.println("Not found : " + skey);
		}
		else
		{
			System.out.println("\nFound " + cnt + "times");
		}
	}
}

public class SinglyList2
{
	public static void main(String args[])
	{
		LinkList lst=new LinkList();
		Scanner sc=new Scanner(System.in);
		
		int ch=0;
		while(ch!=8)
		{
			System.out.print("\n1.Create : ");
			System.out.print("\n2.Display : ");
			System.out.print("\n3.Count : ");
			System.out.print("\n4.Maximum : ");
			System.out.print("\n5.Minimum : ");
			System.out.print("\n6.Sum : ");
			System.out.print("\n7.Search : ");
			System.out.print("\n8.Exit : ");
			System.out.print("\nEnter ur choice :  ");
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
					System.out.println("Enter data to search : ");
					int skey=sc.nextInt();
					lst.searchNode(skey);
					break;
			}
		}
	}
}