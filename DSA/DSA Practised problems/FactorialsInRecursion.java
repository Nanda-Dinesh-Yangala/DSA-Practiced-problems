public class FactorialsInRecursion {
        public static void main(String[] args) {
            int number = 12345;
           System.out.println(reverse(number));
            //System.out.println(palindrom(12321));
        }
        static int reverse(int n){
            int rev=0;

            for(int i=n;i!=0;i/=10){
                int digit=i%10;
                rev=rev*10+digit;
            }

            return rev;
        }
        static boolean palindrom(int n){
            return n==reverse(n);
        }

    }










