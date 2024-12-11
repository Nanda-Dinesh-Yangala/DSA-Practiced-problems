
//Given an array nums of integers,
// return how many of them contain an even number of digits.
//Example 1:
//
//Input: nums = [12,345,2,6,7896]
//Output: 2

public class Leetcode_2problem {
    public static void main(String[] args) {
        int nums[]={12,345,22,61,7896};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[]nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(String.valueOf(nums[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }


}
