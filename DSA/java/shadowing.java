public class shadowing
{
   static  int x=20;
    public static void main(String[] args)
    {
int x=100;
System.out.println(x);
fun();

    }
static void fun(){
    System.out.println(x);
}
}