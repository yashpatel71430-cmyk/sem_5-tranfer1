import java.util.Scanner;
import java.util.Arrays;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Convert the string to a character array
        char[] charArray = input.toCharArray();
        
        // Use Arrays.sort() to arrange characters in alphabetical order
        Arrays.sort(charArray);
        
        // Convert the sorted character array back into a string
        String sortedString = new String(charArray);
        
        // Display the result
        System.out.println("Original String: " + input);
        System.out.println("Alphabetical Order: " + sortedString);
        
        sc.close();
    }
}