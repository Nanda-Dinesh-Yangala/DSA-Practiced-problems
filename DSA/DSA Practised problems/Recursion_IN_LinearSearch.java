public class Recursion_IN_LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 31, 2, 44, 22};
//        int target=44;
        System.out.println(findIndex(arr, 44, 0));
    }

    static boolean linear(int arr[], int target, int index) {

        if ( index == arr.length) {
            return false;
        }
//        if(arr[index] == target){
//            return true;
//        }
        return arr[index] == target || linear(arr, target, index + 1);

    }


    static int findIndex(int arr[], int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if(arr[index]==target){
            return index;
        }else{
            return findIndex(arr,target,index+1);
        }

    }

}














