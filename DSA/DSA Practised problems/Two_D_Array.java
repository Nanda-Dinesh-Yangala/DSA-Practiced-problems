 import java.sql.SQLOutput;
 import java.util.Arrays;
//
//public class Two_D_Array {
//    public static void main(String args[]){
//    int arr[][] ={{33,3,2},
//            {3,53,3},
//            {4,5,3,93,23}};
//    int target=23;
//    int [] ans=search(arr,target);
//    System.out.println(Arrays.toString(ans));
//}
//
//static int[] search(int [][] arr,int target){
//        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                if(arr[row][col]==target){
//                    return new int[]{row,col};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//
//}
//}
//
class Two_D_Array{
    public static void main(String args[]){
        int arr[][]=
                {{3,5,6},
                {2,4,7},
                {3,9,12},
                {4,8,16}};

        int target=2;
        int [] ans=TWODARRAY(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] TWODARRAY(int arr[][],int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int []{-1,-1};
    }
}