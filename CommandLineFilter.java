public class CommandLineFilter {
    public static void main(String[] args) {
        for (String s : args) {
            if (s.equals(s.toUpperCase())) System.out.println(s);
            else break;
        }
    }
}