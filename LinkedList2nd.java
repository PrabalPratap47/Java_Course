// public class LinkedList2nd {
//     // _____single node syntax
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }


//     public static Node head; // assign head and tail
//     public static Node tail;
//     public static int size;




// //___________Detect Cycle in LL (Floyd's cycle finding algo)__________


// public static boolean isCycle(){
//     Node slow = head;
//     Node fast = head;
//     while(fast != null && fast.next != null){
//         slow = slow.next; // +1
//         fast = fast.next.next; // +2
//         if(slow == fast){
//             return true;
//             }
//             }
//             return false;
// }


// //_____________Removing cycles__________


// public static void removeCycle(){
//     //detect Cycle
    
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;
//         while(fast != null && fast.next != null){
//             slow = slow.next; // +1
//             fast = fast.next.next; // +2
//             if(slow == fast){
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle == false){
//             return;
//         }

//         //find meeting point
//         slow = head;
//         Node prev = null; //last node
//         while(slow != fast){
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;

//         }
         

//         //remove cycle -> last.next = null
//         prev.next = null;
    
// }


//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();

//         // head = new Node(1);
//         // head.next = new Node(2);
//         // head.next.next = new Node(3);
//         // head.next.next.next = head;
//         // //1->2->3->1
//         // System.out.println(isCycle());

//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;
//         //1->2->3->2
//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
        


//         // ll.addFirst(2); 
//         // ll.addFirst(1);
//         // ll.addLast(3);
//         // ll.addLast(1);
//         // ll.addInMiddle(4, 1);
//         // ll.printList();
//     }
// }







//________________________________LL using JCF____________________________________

import java.util.LinkedList;
public class LinkedList2nd{
    public static void main(String[] args) {

        //create
        LinkedList <Integer> ll = new LinkedList<>();


        //add
        ll.add(1);
        ll.addFirst(0);
        ll.add(2);
        ll.addLast(3);
        System.out.println(ll);

        //remove
        ll.remove(1);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);


    }
}