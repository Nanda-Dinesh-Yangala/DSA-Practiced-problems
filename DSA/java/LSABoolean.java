public class LSABoolean {
    public static void main(String args[]){
        int arr[]={23,4,56,68,46,34,24};
        int target=24;
        boolean ans=linear(arr,target);
        System.out.println(ans);

    }

//search the target and return true r else false (means printing boolean)

    public static boolean linear(int arr[],int target){
        if(arr.length==0){
            return false;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
