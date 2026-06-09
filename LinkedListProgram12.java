import java.util.*;

class LinkedListProgram12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        int choice;

        do
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add number");
            System.out.println("2. Insert at position");
            System.out.println("3. Remove by value");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter number to add: ");
                    int num = sc.nextInt();
                    list.add(num);
                    System.out.println("Number added.");
                    break;

                case 2:
                    System.out.print("Enter position (index starts from 0): ");
                    int pos = sc.nextInt();
                    System.out.print("Enter number to insert: ");
                    int val = sc.nextInt();

                    if(pos >= 0 && pos <= list.size())
                    {
                        list.add(pos, val);
                        System.out.println("Inserted successfully.");
                    }
                    else
                    {
                        System.out.println("Invalid position!");
                    }
                    break;

                case 3:
                    System.out.print("Enter value to remove: ");
                    int rem = sc.nextInt();

                    if(list.remove(Integer.valueOf(rem)))
                    {
                        System.out.println("Value removed.");
                    }
                    else
                    {
                        System.out.println("Value not found.");
                    }
                    break;

                case 4:
                    System.out.println("Current List: " + list);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);

        sc.close();
    }
}