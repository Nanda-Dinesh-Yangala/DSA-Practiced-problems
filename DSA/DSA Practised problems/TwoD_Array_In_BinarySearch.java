import java.util.Arrays;

public class TwoD_Array_In_BinarySearch {
    public static void main(String[] args) {
        int matrix[][] = {{5,10,15,20 },
                       { 6,12,18,24 },
                       { 9,18,21,27 }};

//        int matrix[][]= {{90,80,70,60},
//                         {81,72,63,54},
//                         {79,64,55,49},
//                         {68,56,51,33}};
        int target=27;
        System.out.println(Arrays.toString(twodarray(matrix,target)));

    }
    static int [] twodarray(int matrix[][],int target) {
            int r=0;
            int c=matrix[0].length-1;// we can also write this as // int c=matrix.length;//this one aslo will work.😊

            while(r < matrix.length && c >=0){

                if(matrix[r][c] == target){
                    return  new int [] {r,c};
                }
                if(target > matrix[r][c] ){
                    r++;
                }else {
                    if(target < matrix[r][c])
                        c--;
                }
            }
                return new int[]{-1,-1};
    }
}





















