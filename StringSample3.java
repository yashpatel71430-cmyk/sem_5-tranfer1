import java.util.*;

class StringSample3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		
		int chh=0;
		while(chh != 5)
		{
			System.out.println("=========String Operations========");
			System.out.println("1. Uppercase");
			System.out.println("2. Length of string");
			System.out.println("3. Reverse String");
			System.out.println("4. Count No of Vowels");
			System.out.println("5. Exit");
			System.out.println("Enter choice : ");
			chh=sc.nextInt();
			switch(chh)
			{
				case 1:
				System.out.println("Uppercase is : " + str.toUpperCase());
				break;
		
				case 2:
				System.out.println("Length of string is : " + str.length());
				break;
	
				case 3:
								
				System.out.println("Reverse is : " + sb.reverse());
				
				break;
		
				case 4:
				int count=0;
				for(int i=0;i<str.length();i++)
				{
					char ch=str.charAt(i);
					if(ch == 'A' || ch== 'E' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					{
					count++;
					}
				}
				System.out.println("Vowels are : " + count);
				break;

		
				case 5:
				System.out.println("Exiting.....");
				break;
			}
			
		}
	}
}