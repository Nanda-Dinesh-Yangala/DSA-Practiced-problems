public class Find_First_and_Last_position {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int target =7;
        System.out.println(searchRange(nums,target));

    }
    static   int[] searchRange(int[] nums, int target) {

        int ans[]={-1,-1};
        //check for first occurence of target first.
        int start=search(nums,target,true);
        int end=search(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    }



    // this function just returns the index value of target.
    static int search(int nums[],int target,boolean findstartindex){

        int ans=-1; // potential ans
        int start=0;
        int end=nums.length-1;

        while( start <= end){
            int mid = start+(end-start)/2;

            if(target < nums[mid]){
                end=mid-1;
            } else if (target > nums[mid]) {
                start=mid+1;
            }
            else{
                //potential ans found.
                ans=mid;
                if(findstartindex == true){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            }
        }
        return ans;

    }
    }
















