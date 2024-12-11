public class Demo4 {

    public static void Name(int a,int b,int c){
        int sales=a+b+c;
        int product=a * b * c;
        int quotion=a*b/c;
        System.out.println("yout current Sales is "+sales);
        System.out.println("your products is"+product);
        System.out.println("your quotation is"+quotion);
    }
    public static void main(String args[]){
       Name(2,4,6);
       Name(4,5,2);

    }
}
