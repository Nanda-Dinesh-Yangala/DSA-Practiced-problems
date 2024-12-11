
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int arr[]={46,5,89,456,98,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static  void bubble(int arr[]){
        boolean swapped;
        // run the steps n-1 times
        for(int i=0;i< arr.length;i++){
            swapped = false;
            //for each step,max item will come at the last respective index.
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item😉.
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
     // if u did not swap for a particular value of i,it means the  array is sorted hence stop the program.
     if(!swapped) {   // if(swapped = false) break;
         break;
     }
        }

    }
}
















