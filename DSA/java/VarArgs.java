// import java.util.Arrays;

//public class VarArgs {
//    public static void main(String[]args){
//          fun("nanda","dinesh",2,4,6,43,3);
//        //fun("nanda","dinesh","d","ert");
//        multiple(2,3,"nanda","ds","sd");
//    }
//
//    static void fun(String a,String b,int...v){
//        System.out.println(Arrays.toString(v));
//    }
//    static void multiple(int a,int b,String...v){
//        System.out.println(a+" "+b +Arrays.toString(v));
//    }
//}
import java.util.Arrays;
class VarArgs{
    static void bad(String a,int...v){
        System.out.print(a);
        System.out.println(Arrays.toString(v));

    }
    static void bad(int a,String...v ){
        System.out.print(a);
        System.out.println(Arrays.toString(v));

    }

    public static void main(String args[]){
         bad(1,"e","w","wf","wef","wef","we");
         bad("fs",1,32,4,56,4,34,64,35);
    }
}