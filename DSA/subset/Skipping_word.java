package subset;

public class Skipping_word {
    public static void main(String[] args) {
        System.out.println(word("basapplesdqw"));
    }
    static String word(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return word(up.substring(5));
        }else {
            return word(up.charAt(0)+word( up.substring(1)));
        }
    }
}
