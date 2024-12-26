package subset;

public class Demo1 {
    public static void main(String[] args) {

        skip(" ","asbsdbwdbasbasb");
    }
    static void skip(String pr,String unpr){
        if(unpr.isEmpty()){
            System.out.println(pr);
            return;
        }
        char ch=unpr.charAt(0);
        if(ch == 'a'){
            skip(pr,unpr.substring(1));
        }else {
            skip(pr+ch,unpr.substring(1));
        }

    }
}
