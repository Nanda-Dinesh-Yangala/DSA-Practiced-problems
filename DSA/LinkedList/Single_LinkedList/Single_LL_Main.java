package LinkedList.Single_LinkedList;

public class Single_LL_Main {
    public static void main(String[] args) {

        Single_LinkedList list = new Single_LinkedList();

        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertFirst(1);
        list.insertFirst(9);

        list.insertLast(99);
        list.insertLast(88);

        list.insert_Between(100,3);

        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.deleteLast();
        System.out.println(list.deleteMiddle(3));// 8 will remove.


        list.display();
    }
}
