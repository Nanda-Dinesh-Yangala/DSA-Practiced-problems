public class ceiling {
    //colission means returning the
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=19;
        System.out.println(bs(arr,target));

    }
    // return the smallest number greater then target number.

    static int bs(int arr[],int target){

        if(target > arr[arr.length-1]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;

        while(start <= end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(target < arr[mid]){
                end=mid-1;

            }
            else{
                if(target > arr[mid]){
                    start=mid+1;
                }
            }
        }
        return start;
    }
}









