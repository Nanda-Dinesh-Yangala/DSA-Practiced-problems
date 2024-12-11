import java.util.*;
public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(12);
            Scanner in=new Scanner(System.in);


//           list.add(23);
//           list.add(123);
//           list.add(45);
//           list.add(345);
//           list.add(13);
//
//           list.contains(23);
//
//           System.out.println(list);
//        list.set(0,99);
//        list.remove(1);
//           System.out.println(list.contains(1243));
//        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
            System.out.println(list);
    }
}
