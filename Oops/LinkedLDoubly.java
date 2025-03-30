public class LinkedLDoubly {
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;


    //Add at the first
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }

    //remove at first
    public int removeFirst(){
        int val = head.data;
        if(head == null){
            System.out.println("List is empty");
            return -1;
            }
        else if(head == tail){
            head = tail = null;
            return -1;
        }
            else{
                head = head.next;
                head.prev = null;
            }
            size--;
            return val;
    }




    //Print the list
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
        }


    public static void main(String[] args) {
        LinkedLDoubly linkedLDoubly = new LinkedLDoubly();
        linkedLDoubly.addFirst(4);
        linkedLDoubly.addFirst(3);
        linkedLDoubly.addFirst(2);
        linkedLDoubly.addFirst(1);
        linkedLDoubly.printList();

        linkedLDoubly.addFirst(0);
        linkedLDoubly.printList();

        linkedLDoubly.removeFirst();
        linkedLDoubly.printList();

    }
    
}
