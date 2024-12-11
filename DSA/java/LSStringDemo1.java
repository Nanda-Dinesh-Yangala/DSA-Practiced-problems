public class LSStringDemo1{
    public static void main(String args[]){
        String word="Ganesh";
        char target='G';
        System.out.println(linear(word,target));

    }
    static String linear(String str,char target){
        if(str.length()==0){
            return "12345";
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target){
                return "correct";
            }
        }
        return "678910";
    }
}