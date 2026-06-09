import java.util.*;

class StringSample2
{
	public static void main(String args[]) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string :");
	String st=sc.nextLine();
	String ar[]=st.split(" ");
	System.out.println("Total Words "+ ar.length);
	System.out.println("String "+ st);
	for (int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	    if (ar[i].startsWith("H"))
	        System.out.println("Starts with H " + ar[i]);
		if (ar[i].endsWith("ing"))
	        System.out.println(ar[i] + " ends with ing");
	}
	}
}