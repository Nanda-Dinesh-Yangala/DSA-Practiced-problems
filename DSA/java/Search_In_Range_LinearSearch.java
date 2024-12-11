import java.util.Arrays;
public class Search_In_Range_LinearSearch {
    public static void main(String args[]){
        int arr[]={2,23,9,32,6,8,4,28};
        int target=32;
        System.out.println(linear(arr,target,2,5));

    }
    static int linear(int [] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;

        }
        for(int index=start;index<end;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;
    }
}
