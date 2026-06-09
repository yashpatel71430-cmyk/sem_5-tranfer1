import java.util.Scanner;

class Student1 {
    String name;
    int rollNo;
    int marks;

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First student
        Student1 s1 = new Student1();
        System.out.print("Enter name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter roll number: ");
        s1.rollNo = sc.nextInt();
        System.out.print("Enter marks: ");
        s1.marks = sc.nextInt();
        sc.nextLine(); -

        // Second student
        Student1 s2 = new Student1();
        System.out.print("Enter name: ");
        s2.name = sc.nextLine();
        System.out.print("Enter roll number: ");
        s2.rollNo = sc.nextInt();
        System.out.print("Enter marks: ");
        s2.marks = sc.nextInt();

        // Display details
        System.out.println("\nStudent Details:");
        s1.display();
        s2.display();

        sc.close();
    }
}
