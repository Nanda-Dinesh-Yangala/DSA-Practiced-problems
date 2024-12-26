package subset;

public class Skipping_word {
    public static void main(String[] args) {
        System.out.println(word("bcappleasfad"));
    }
    static String word(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return word(up.substring(5));
        }else {
            return up.charAt(0)+word(up.substring(1));
        }
    }
}
