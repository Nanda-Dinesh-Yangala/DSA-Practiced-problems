import java.util.Scanner;
class LSADemo1{

//                  Strings one in linear search
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String letter=in.nextLine();

        String words[]={"a","b","d","e","f","g"};
        String target="b";
        int res=linearsearch(words,target);
        System.out.println(res);
    }
    static int linearsearch(String[]arr,String target){
        if(arr==null ||target==null){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index].equalsIgnoreCase(target)){
                return index;
            }
        }
        return-1;
    }
}