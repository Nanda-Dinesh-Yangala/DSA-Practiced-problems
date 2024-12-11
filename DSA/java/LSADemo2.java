class LSADemo2{
    public static void main(String args[]){
        int arr[]={2,3,59,8,56,23,5,};
        int target=5;
        int res=linear(arr,target);
        System.out.println(res);

    }
    static int linear(int []arr,int target){


        if(arr.length==0){
            return-1;

        }
        for(int index =0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }

        return-1;
    }

}