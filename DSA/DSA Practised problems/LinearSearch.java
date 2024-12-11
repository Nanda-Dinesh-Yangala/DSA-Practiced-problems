public class LinearSearch {
    public static void main(String args[]){
       int arr[]={3,6,8,54,76,23};
       int target=54;
       System.out.println(linear(arr,target ,1,4));
    }
    static int linear(int arr[],int target,int start,int end){
       if(arr.length==0){
           return -1;
       }
       for(int index=start;index<end;index++){
           if(arr[index]==target){
               return index;
           }
       }
       return -1;
    }
}
