import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr={88,76,45,43,};
        swap(arr, 1,3);
        //          error  Here ?????????????????
        System.out.println(Arrays.toString(arr));


    }


    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
