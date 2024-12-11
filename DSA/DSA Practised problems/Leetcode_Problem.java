import java.sql.SQLOutput;

public class Leetcode_Problem {
    public static void main(String[] args) {
        int num[]={12,345,2,6,7896};
        System.out.println(findNumber(num));
    }
    static int findNumber(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }

         return count;

            }
//function to check weather a number contains even digits or not
 static boolean even(int num) {
int numberOfDigits=digits(num);
if(numberOfDigits % 2==0){
    return false;
}
return false;
    }
    //count number of digits in a number
    static int digits(int num){
       int count=0;
        while(num>0){
        count++;
        num=num/10;//
        }
        return count;
    }

}

