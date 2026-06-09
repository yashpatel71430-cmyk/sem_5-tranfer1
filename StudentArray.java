import java.util.Scanner;

public class StudentArray
 {
    public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);

        int rollNo[] = new int[5];
        String name[] = new String[5];
        int marks[] = new int[5];
        char grade[] = new char[5];

        // Input
        for (int i = 0; i < 5; i++) 
           {
            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Roll No: ");
            rollNo[i] = sc.nextInt();

            sc.nextLine(); // buffer clear

            System.out.print("Name: ");
            name[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();

            // Grade calculation
            if (marks[i] >= 80)
                grade[i] = 'A';
            else if (marks[i] >= 60)
                grade[i] = 'B';
            else if (marks[i] >= 40)
                grade[i] = 'C';
            else
                grade[i] = 'F';

            System.out.println();
        }

        // Output
        System.out.println("\n----- Student Details -----");
        for (int i = 0; i < 5; i++) {
            System.out.println("Roll No: " + rollNo[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("---------------------------");
        }

        sc.close();
    }
}