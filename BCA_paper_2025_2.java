import java.util.*;

class BCA_paper_2025_2
{

   public static void main(String[] args)
   {
   Scanner sc= new Scanner(System.in);

   System.out.println("Enter a String :");
      String st=sc.nextLine();
       System.out.println("1. Upper Case");
       System.out.println("2. Length");
       System.out.println("3. Reverse");
       System.out.println("4. Count vowels");
       System.out.println("Enter the choice ::");
      int ch = sc.nextInt();
      switch(ch)
{
 
      case 1:

             System.out.println("string in Uppercase" +st.toUpperCase());
             break;
      case 2:
              System.out.println("Length of String is "+st.length());
             break;
      case 3:
             String rev ="";
             for(int i=st.length()-1;i>=0;i--)
                {
                 char t=st.charAt(i);
                 rev=rev+t;
                }
                 System.out.println(rev);
                break;
      case 4:
              int cnt =0;
             for(int i=0;i<st.length();i++)
                {
                 char t=st.charAt(i);
                 if (t=='a' || t=='e' || t=='i' || t=='o' || t=='u' ||t=='A' ||t=='E' ||t=='I' ||t=='O' ||t=='U')
                 cnt++;
                }
                 System.out.println("Total Vowels are"+ cnt);
                 break;
      }
}
}