public class Recursion1 {
    public static void main(String[] args) {
      print1(1);
    }
    static void print1(int n){

        // function calling itself is called recursion.
//base condition
        if(n == 5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        //recursion call
        // if you r calling a function again and again, you can treat it as a seperate call in the stack.🤷‍♀️
        print1(n+1);
    }
}
