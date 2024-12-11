import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays_in_func {
    public static void main(String[] args) {
int a[]={2,4,5,7,3,2,5,6,3,2,2,33,9};
int count=0;
for(int i=0;i<a.length;i++){
    if(a[i]==33){
        count++;
    }
}
        System.out.println(count);

        }

}
