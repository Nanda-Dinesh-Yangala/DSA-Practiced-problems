import java.util.Arrays;

public class Sorting_check_Using_Recursion {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,8,9};


        System.out.println(sorted(arr,0));

    }
   static boolean sorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index] <arr[index+1] && sorted(arr,index+1);

   }
}






