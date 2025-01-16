package subset;

public class subset_Skipping_Character_returnType {
    public static void main(String[] args) {
        System.out.println(skip("asbsdbwdbasbasb"));
    }
    static String skip(String unp){

        if(unp.isEmpty()){
            return "";
        }
        char ch=unp.charAt(0);
        if(ch == 'a'){
            return skip(unp.substring(1));
        }else {
            return  ch+skip(unp.substring(1));
        }
    }
}
