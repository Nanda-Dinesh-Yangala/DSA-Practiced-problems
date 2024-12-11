//                                           Function overloading
public class Overloading {

    static void gen(int a,int b){

        System.out.println(a+" "+b);
    }
    static void gen(int a){
        System.out.println(a);
    }


    public static void main(String[]args){
gen(20 ,5);
gen(3);
    }
}
//class VarArgs{
//    static void fun(int a,int b,String c){
//        System.out.println(a+" "+b+" "+c);
//    }
//    static void fun(int a,int b){
//        System.out.println(a+" "+b);
//    }
//    public static void main(String []args){
//
//        //  fun(3,4,"sdsd");
//        fun(2,4,"dvf");
//
//    }
//}