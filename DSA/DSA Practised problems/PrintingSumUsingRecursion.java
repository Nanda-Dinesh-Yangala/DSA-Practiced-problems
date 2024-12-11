public class PrintingSumUsingRecursion {
    public static void main(String[] args) {
        printsum(1,5,0);

    }
    static void printsum(int i,int n,int sum) {

        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printsum(i+1,n,sum);



    }
}
