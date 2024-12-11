import static java.util.Collections.min;

public class TWO_D_Array_max {
    public static void main(String[] args) {
        int arr[][]=
                       {{9,5,6},
                        {2,4,7},
                        {1,9,12},
                        {4,8,16}};
        System.out.println(max(arr));

    }


    static int max(int arr[][]){
        int max=Integer.MAX_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]< max){
                    max=arr[row][col];
                }

            }
        }
        return max;

    }
}
