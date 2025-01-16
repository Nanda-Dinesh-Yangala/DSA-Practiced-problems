package LinkedList.Single_LinkedList;


public class Single_LinkedList {

        // step-2
        // what all the 2 things we have while implementing internal linekdLiked head and tail
        private Node head;
        private  Node tail;
        private  int size;

        // step-3
        //constructor
        public Single_LinkedList(){
            this.size=0;
            //here we initialize default size r esle start size is 0.
        }

        // step-4
        public void insertFirst(int val){
            Node node = new Node(val);// create a new box or node to add value inside that box❤‍🔥🔥.
            node.next = head;
            head = node;
            //if they is no node will provide on that time  tail is null,and both head and tail is represents the
            // same value or node tail = head;
            if(tail == null){
                tail=head;
            }
            size=size+1;   // size +=1;
        }
        //step-6
        public void insertLast(int val){
            //base
            if(tail == null){  // this time complexity of this insertcode  is constant
                insertFirst(val); // pls inset value first man😒
                return;
            }
            Node node = new Node(val);
            tail.next = node;
            tail=node;
            size++;
        }
        //step-7
        public  void insert_Between(int val,int index){
            if(index == 0){
                insertFirst(val);
                return;
            }
            if(index == size){
                insertLast(val);
                return;
            }
            //other wise
            Node temp = head; //start checking from head // current temp is in index 0.
            for(int i=1;i<index;i++){
                // why i am starting i=1 is here bec above line temp or head is there in index1.
                temp = temp.next;//move forward upto before index  to add that value.
            }//temp.next is current index.
            //create node for to insert between
            Node node = new Node(val,temp.next);//here current index is temp now.
            temp.next=node;
            size++;
        }
        //step-8
        public int deleteFirst(){
            int val = head.value; // Store the value of the first node (head)
            head = head.next; // Step 2: Move the head to the next node (removes the first node from the list)

            if(head == null){// Step 3: If the list is now empty, set the tail to null
                tail = null;
            }
            size --;// Step 4: Decrease the size of the list as we've removed one node.
            return val;  // return  what u removed value
        }
        //step-10
        public  int deleteLast(){
            if(size <= 1){//If the list has 1 or fewer elements, delete the first node instead.
                return deleteFirst();
            }
            Node secondLast = get(size - 2);//Get the second-to-last node
            int val = tail.value;// Store the value of the last node (the one to be deleted).

            tail = secondLast;//after deleting that node updating tail to second last.
            tail.next = null;//Set the next of the new tail to null

            return val;//Return the value of the deleted node
        }
        // step-11
        public int deleteMiddle(int index){
            if(index == 0){
                return deleteFirst();
            }
            if(index == size -1){ // If the index is the last one (size - 1), call deleteLast() to remove the last node

                return deleteLast();
            }
            Node previous = get(index - 1);// For all other cases (deleting a middle node)
            // Get the previous node of the one to be deleted.
            int val = previous.next.value;  // Store the value of the node to be deleted (previous.next)
            previous.next = previous.next.next;    // Remove the node by skipping over it (set previous.next to the next node of the deleted one).


            return val;
        }

        //step-9
        public Node get (int index){
            Node node = head; // start from the head
            for(int i=0;i<index;i++){ //iterate the list until the desire index is reached
                node = node.next; //move to next node in the list
            }
            return node;
        }

        //step-5
        public void display(){
            //creating new temp to move next
            Node temp = head;
            //we don't know how many nodes r values  are there so we will take while
            while(temp != null){
                System.out.print(temp.value + "-> ");
                temp = temp.next;//step forward and see if node is present r there
            }
            System.out.println("END");
        }



        // Step :-1

        // here we  writing what that container contains
        private class Node{
            // i don't want to access any one directly so that why we r put private here
            private int value;
            private Node next;

            //here we r creating constructor for that above code
            // in constructor 1 takes a simple value .
            public Node(int value){

                this.value =value;
            }
            //this constructor will takes two values
            public Node(int value,Node next){
                this.value=value;
                this.next=next;
            }

        }
    }




