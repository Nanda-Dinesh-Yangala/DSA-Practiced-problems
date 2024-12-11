import java.sql.Array;
import java.util.ArrayList;

public class ArrayList_in_Recursion {
    public static void main(String[] args) {
        int arr[]={3,5,2,6,9,6,22};

        System.out.println(findAllIndex(arr,6,0,new ArrayList<>()));

    }

    static  ArrayList<Integer> findAllIndex(int arr[],int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
           return findAllIndex(arr,target,index+1,list);

    }

}









