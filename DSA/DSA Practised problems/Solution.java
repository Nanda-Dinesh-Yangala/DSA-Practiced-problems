import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        System.out.println((arr));

    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
                int correct =nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }

        }
        for(int index=0;index< nums.length;index++){
            if(nums[index] != index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap (int nums[],int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }

}

//     static  List<Integer> findDisappearedNumbers(int[] nums) {
//        int i=0;
//
//        while(i<nums.length){
//            int correct=nums[i]-1;
//            if( nums[i] != nums[correct] ){
//                swap(nums,i,correct);
//            }else{
//                i++;
//            }
//        }
//        // just find the missing numbers
//         List<Integer> ans=new ArrayList<>();
//        for(int index=0;index<nums.length;index++){
//            if(nums[index] != index + 1){
//                ans.add(index+1);
//            }
//        }
//        return ans;
//    }
//    static void swap(int nums[],int first,int second){
//        int temp=nums[first];
//        nums[first]=nums[second];
//        nums[second]=temp;
//
//    }
//}













