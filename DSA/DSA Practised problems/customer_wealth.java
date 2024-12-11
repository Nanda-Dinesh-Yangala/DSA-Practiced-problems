public class customer_wealth {
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},
                       {3,40,1},
                       {4,5,1}};
        System.out.println(wealth(arr));

    }
    static int wealth(int accounts[][]){
        //person = row
        //account= col
        int ans=Integer.MIN_VALUE;

        for(int row=0;row<accounts.length;row++){
            //when u start a new col,take a new sum for that row.
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum +=accounts[row][col];
            }
            //now we have sum of accounts of row
            //check with overall ans
            if(sum>ans){
                ans=sum;
            }

        }return ans;
    }


}
