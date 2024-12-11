
public class Descending_order {
    public static void main(String[] args) {
        int arr[]={98,86,75,64,53,44,33,12,22,11,10,8,5,2};
     // int arr[]={1,3,4,6,8,9,12,15,26,48,59};
      int target=5;
        System.out.println(orderAgnostoc_BS(arr,target));

    }
    static int orderAgnostoc_BS(int arr[], int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        //we can write like this r else like this 😉.

//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc=true;
//        }else {
//            isAsc=false;
//        }

        while(start <= end) {
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
           // here we r writing this code why means because,
           //we dont know weather it is asccending r desending order so thats why
           //we r writing like this if condition.
            if(isAsc){

                if(target < arr[mid]){
                   end=mid-1;
                } else{
                   // if(target >arr[mid])
                        start=mid+1;
                }

            }else{
                //descending order aiethay 😒

                if(target > arr[mid]){
                     end=mid-1;
                }else{
//                    if(target < arr[mid])
                        start=mid+1;
                }

            }
        }
        return -1;

    }
}
