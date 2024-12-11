public class CountNumbers {
    public static void main(String[] args) {
        int n=3020406;
        System.out.println(counting(n));
    }
static int counting(int n){
        int count=0;
        while(n!=0){
            int digit=n%10;
            if(digit==0){
                count++;
            }
            n/=10;
        }
        return count;
}












    static int Counting(int n){
    int count=0;

    while(n!=0){
        int digit=n%10;
        if(digit ==2){
            count++;
        }
        n/=10;
    }
    return count;
}

}












