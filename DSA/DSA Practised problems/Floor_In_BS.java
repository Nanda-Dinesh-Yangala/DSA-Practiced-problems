public class Floor_In_BS {
    public static void main(String[] args) {
        int  arr[]={2,3,5,9,14,16,18};
        int target=1;
        System.out.println(floor(arr,target));

    }
    // return the greatest number <= target;
    static int floor(int arr[],int target){
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;

        while(start <=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target <arr[mid]){
                end=mid-1;
            }
            else{
                if(target > arr[mid]){
                    start=mid+1;
                }
            }
        }
        return end;
    }
}
















