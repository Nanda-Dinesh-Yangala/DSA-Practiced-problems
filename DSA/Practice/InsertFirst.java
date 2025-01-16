package Practice;

public class InsertFirst {
    public static void main(String[] args) {
        LL list = new LL();      // Create an instance of the LL class
        list.insertFirst(4); // Call insertFirst on the instance of LL
        list.insertFirst(45);
        list.insertFirst(6);
        list.insertFirst(67);
        list.insertFirst(3);
        list.insertFirst(9);
        list.insertFirst(12);
        list.display();           // Optionally, display the list to check if the insertion worked
    }

    static class LL {
        private Node head;

        // Method to insert a node at the beginning of the list
        public void insertFirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
        }

        // Method to display the list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value +"->");
                temp = temp.next;
            }
            System.out.println("END");
        }

        // Inner Node class representing a node in the linked list
        class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }
        }
    }
}
