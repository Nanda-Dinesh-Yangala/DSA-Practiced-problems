public class Search_In_Range_Example {
    public static void main(String args[]){
        int arr[]={1, 3, 5, 7, 9, 3, 2, 3};
        int target =3;
        System.out.println(linear(arr,target,4,7));

    }
    static int linear(int arr[],int target,int start,int end){
        //arr: an array of integers (e.g., {1, 3, 5, 7, 9, 3, 2, 3}).
//target: the integer you want to search for (e.g., 3).
//start: the starting index of the range (e.g., 4).
//end: the ending index of the range (e.g., 7).
if(arr.length==0){
    return -1;
}
//for(int index=start;index<end;index++){
//    int element=arr[index];
//    if(element==target){
//        return index;
//    }
//}
        for(int index=start;index<end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}

