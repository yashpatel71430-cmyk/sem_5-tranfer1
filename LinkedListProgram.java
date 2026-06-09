import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add number");
            System.out.println("2. Insert at position");
            System.out.println("3. Remove by value");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add: ");
                    int num = sc.nextInt();
                    list.add(num);
                    System.out.println("Number added.");
                    break;

                case 2:
                    System.out.print("Enter position (0-based index): ");
                    int pos = sc.nextInt();
                    System.out.print("Enter number: ");
                    int value = sc.nextInt();

                    if (pos >= 0 && pos <= list.size()) {
                        list.add(pos, value);
                        System.out.println("Number inserted.");
                    } else {
                        System.out.println("Invalid position!");
                    }
                    break;

                case 3:
                    System.out.print("Enter number to remove: ");
                    int removeVal = sc.nextInt();

                    if (list.remove(Integer.valueOf(removeVal))) {
                        System.out.println("Number removed.");
                    } else {
                        System.out.println("Value not found!");
                    }
                    break;

                case 4:
                    System.out.println("List: " + list);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}