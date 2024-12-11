public class LinearSearchAlgorithm {

    public static void main(String[] args) {
        int arr[]={2,45,76,587,34,35,57,3534,243};
        int target=34;
        int ans= linearSearch(arr,target);
        System.out.println(ans);
    }
// search in the array: return the index if item found.
//otherwise if item not found return -1.
    static int linearSearch(int arr[],int target){
        if(arr.length==0){
         return -1;
}
//run a for loop
       for(int index=0;index<arr.length;index++){
          //check for the element at every index if it is = target.
           int element =arr[index];
           if(element ==target){
               return index;
           }
       }
//this line will execute if none of this return statements above have executed.
//hence the target not found.
            return-1;
    }
}
