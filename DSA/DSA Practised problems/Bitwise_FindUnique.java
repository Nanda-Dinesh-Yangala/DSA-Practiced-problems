public class Bitwise_FindUnique {
    public static void main(String[] args) {
        int arr[]= {2,4,3,4,2,7,3};
        System.out.println(uique(arr));
    }
    static int uique(int arr[]){
        int unique=0;

        for(int n :arr){
            unique ^= n;
        }

        return unique;
    }
}
