public class Infinite_sorted_Array {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,9,11,13,16,17,19,20,24,28,30};
        int target=15;
        System.out.println(infinte(arr,target));

    }
    static int infinte(int arr[],int target){
     int start=0;
     int end=arr.length-1;
     while(start <= end){
         int mid=start+(end-start)/2;
         if(target <arr[mid]){
             end=mid-1;
         }else if( target > arr[mid]){
             start=mid+1;
         }else{
             return mid;
         }


     }
     return end;
    }
}























