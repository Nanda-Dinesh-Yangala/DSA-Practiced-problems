//import java.util.Arrays;
//                 😒🫡🤷‍♂️  no answer for this try again and again😒🫡🤷‍♂️
//public class TwoD_metrix_Desc_using_BS {
//    public static void main(String[] args) {
//        int matrix[][]= {{90,80,70,60},
//                         {81,72,63,54},
//                         {79,64,55,49},
//                         {68,56,51,33}};
//        int target=55;
//        System.out.println(Arrays.toString(des(matrix,target)));
//    }
//    static int[] des(int matrix[][],int target){
//        int r=0;
//        int c= matrix[0].length-1;
//        while (r < matrix.length && c >= 0){
//
//            if (matrix[r][c] == target){
//                return new int[]{r,c};
//            }
//            if( matrix[r][c]< target){
//                r++;
//            }else {
//                c--;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//}
//
//import java.util.Arrays;
//
//class Main {
//    public static void main(String[] args) {
//        int matrix[][] = {
//            {90, 80, 70, 60},
//            {81, 72, 63, 54},
//            {79, 64, 55, 49},
//            {68, 56, 51, 33}
//        };
//
//        int target = 55;
//        System.out.println(Arrays.toString(two(matrix, target)));
//    }
//
//    static int[] two(int matrix[][], int target) {
//        int r = 0; // Start at the top row
//        int c = matrix[0].length - 1; // Start at the last column
//
//        while (r < matrix.length && c >= 0) {
//            // Print the current matrix value and coordinates
//            System.out.println("Checking at [" + r + "][" + c + "] = " + matrix[r][c]);
//
//            if (matrix[r][c] == target) {
//                return new int[] { r, c }; // Found the target, return its position
//            }
//
//            if (target > matrix[r][c]) {
//                r++; // Move down if target is greater (since the matrix is in descending order)
//            } else {
//                c--; // Move left if target is smaller
//            }
//        }
//
//        return new int[] { -1, -1 }; // Target not found
//    }
//}

import java.util.Arrays;

class  TwoD_metrix_Desc_using_BS{
    public static void main(String[] args) {
        int matrix[][] = {
                {90, 80, 70, 60},
                {81, 72, 63, 54},
                {79, 64, 55, 49},
                {68, 56, 51, 33}
        };

        int target = 55;
        System.out.println(Arrays.toString(two(matrix, target)));
    }

    static int[] two(int matrix[][], int target) {
        int r = 0; // Start at the top row
        int c = matrix[0].length - 1; // Start at the last column

        while (r < matrix.length && c >= 0) {
            // Print the current matrix value and coordinates
            System.out.println("Checking at [" + r + "][" + c + "] = " + matrix[r][c]);

            if (matrix[r][c] == target) {
                return new int[] { r, c }; // Found the target, return its position
            }

            if (target > matrix[r][c]) {
                r++; // Move down if target is greater (since the matrix is in descending order)
            } else {
                c--; // Move left if target is smaller
            }
        }

        return new int[] { -1, -1 }; // Target not found
    }
}

//
