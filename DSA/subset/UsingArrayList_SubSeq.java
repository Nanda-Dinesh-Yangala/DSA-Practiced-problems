package subset;

import java.util.ArrayList;

public class UsingArrayList_SubSeq {
    public static void main(String[] args) {
        System.out.println(subseqReturn("", "abc"));
    }

    static ArrayList<String> subseqReturn(String p, String up) {
        // Base case: if 'up' is empty, return a list containing the prefix
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Get the first character of the string
        char ch = up.charAt(0);

        // Recursive call including the current character (left branch)
        ArrayList<String> left = subseqReturn(p + ch, up.substring(1));

        // Recursive call excluding the current character (right branch)
        ArrayList<String> right = subseqReturn(p, up.substring(1));

        // Combine both branches
        left.addAll(right);

        return left;
    }
        // or
//        // Combine both branches
//        right.addAll(left);
//
//        return right;
//    }
}
