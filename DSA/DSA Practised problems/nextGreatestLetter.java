public class nextGreatestLetter {
    public static void main(String[] args) {
//        String letters[] = {"c","f","j"};
//        String target = "a";

    }
    static char Greatest(char []letters,char target){

        int start=0;
        int end=letters.length-1;

        while(start <=end){
            int mid=start+(end-start)/2;

            if(letters[mid]==target){
                return letters[mid];
            }

            if(target < letters[mid]){
                end=mid-1;
            }
            else{
                if(target > letters[mid]){
                    start =mid+1;
                }
            }

        }return letters[start % letters.length];

    }
}




























