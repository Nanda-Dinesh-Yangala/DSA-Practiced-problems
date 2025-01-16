package subset;

public class SubSequense {
    public static void main(String[] args) {
        seq("", "abc");
    }

    static void seq(String p, String up) {
        // Base case: if the string is empty, print the subsequence
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        // Recursive case:
        char ch = up.charAt(0); // Get the first character of the string

        // Take it - include the character
        seq(p + ch, up.substring(1));

        // Don't take it - exclude the character
        seq(p, up.substring(1));
    }
}
