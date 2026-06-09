
import java.util.*;
public class StringSort {
    public static void main(String[] args) {
        // For Alphabetical order of a single word (Q8)
        String word = "COMPUTER";
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        System.out.println(new String(chars));
    }
}