public class LinkedList {
    // _____single node syntax
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // assign head and tail
    public static Node tail;
    public static int size;

    // _______Add First_____________________
    public void addFirst(int data) {
        // step-1 Create new node
        Node newNode = new Node(data);
        size++;
        // if Linkedlist is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // step-2 newNode next = head
        newNode.next = head; // newnode.next pr head hai
        // step-3 head = newNode
        head = newNode;
    }

    // _______Add Last_____________________
    public void addLast(int data) {
        // step-1 Create new node
        Node newNode = new Node(data);
        size++;
        // if Linkedlist is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        // step-2 newNode next = head
        tail.next = newNode; // tail.next pr new node hai
        // step-3 head = newNode
        tail = newNode;
    }

    // ________________Add in middle________
    public void addInMiddle(int indx, int data) {

        // if we want to add to add at 0th index or head then
        if (indx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head; // assigning head
        int i = 0;

        while (i < indx - 1) {
            temp = temp.next; // to increment temp till we reach index of where we want to add , for ex- for
                              // 2nd index we need to reach 1st indx to add
            i++;
        }

        // i = indx-1; temp ->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    // ________Remove from first___________
    public int removefirst() {
        // spl case
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data; // jis value ko delete krne vale hai val
        head = head.next;
        size--;
        return val;// to return the value of first node (which am not getting)

    }

    // ___________Remove from last____________
    public int removelast() {
        // spl case
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // PREV : i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail.data //jis value ko delete krne vale hai val
        prev.next = null;
        tail = prev;
        size--;
        return val; // to return the value of last node (which am not getting)

    }

    // ________________Print the LL_____________

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // _________Iterative search___________Tc:- O(n)
    public int Itrseach(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        // key not found
        return -1;
    }

    // ____________Recurive seach_____________ Tc:- O()
    public int helper(Node head, int key) {
        if (head == null) { // if head reaches to null
            return -1;
        }
        if (head.data == key) { // checking head
            return 0;
        }
        int idx = helper(head.next, key); // calling helper function
        if (idx == -1) { // if not found in recursive call
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // ___________Reverse a LL____________ Tc:- O(n)
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // ____________Find Nth element from last and remove it________
    public void removeNthFromEnd(int n) {

        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // check if n is valid
        if (n > size) {
            System.out.println("Invalid position");
            return;
        }

        // if we need to remove head node
        if (n == size) {
            head = head.next;
            return;
        }

        // size-n
        int i = 1;
        int iToFind = size - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // ______________FInd if ll is Palindrome____________

    // slow-fast approach
    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is midnode
    }

    public boolean checkPalindrome() {
        if (head == null && head.next == null) {
            return true;
        }
        // Step-1 Find Middle
        Node mid = findmid(head);

        // Step-2 reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;

        // Step-3 Compare 1st half and 2nd half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }



    //__________________________Merge Sort in LL_________________________

    private Node merge(Node head1, Node head2) { // head1 right ka head and head2 left ka head
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // mid node
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getmid(head);

        // left & right merge sort
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);

        // merge
        return merge(newLeft, newRight);

    }




    //_______________________Zig Zag in LL______________________

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            }
        Node mid = slow;

        //Reverse 2nd half
        Node curr = mid.next; //curr means curr head not sure
        mid.next = null;
        Node prev = null;
        Node next ;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            }
            Node left = head;
            Node right = prev;
            Node nextL, nextR;


        // zig zag merge
        while(left != null && right !=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next=nextL;

            left = nextL;
            right = nextR;
        }


    }






    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.printList();
        // ll.addFirst(2);
        // // ll.printList();
        // ll.addFirst(1);
        // // ll.printList();
        // ll.addLast(3);
        // // ll.printList();
        // ll.addLast(1);
        // ll.addInMiddle(4, 1);

        // ll.printList();

        // System.out.println(ll.size);

        // ll.removefirst();
        // ll.printList();
        // System.out.println(ll.size);

        // ll.removelast();
        // ll.printList();
        // System.out.println(ll.size);

        // System.out.println(ll.Itrseach(3));
        // System.out.println(ll.Itrseach(30));

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(30));

        // ll.reverse();
        // ll.printList();

        // ll.removeNthFromEnd(3);
        // ll.printList();

        // System.out.println(ll.checkPalindrome());



        //merge sort
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // //5-4-3-2-1-null
        // ll.printList();
        // ll.head = ll.mergeSort(ll.head); //mergesort ko call krenge ll.head ke liye fir jo nya head return ho kr aaega vo bi ll.head ke andr store ho  jae
        // ll.printList();



        //zigzag
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        ll.zigZag();
        ll.printList();






    }
}
