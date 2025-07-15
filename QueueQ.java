import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueQ {
    // static class Queue {
    // static int arr[];
    // static int size;
    // static int rear;

    // Queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // }

    // public static boolean isEmpty() {
    // return rear == -1;
    // }

    // // add
    // public static void add(int data) {
    // if (rear == size - 1) {
    // System.out.println("Queue is full");
    // return;
    // }
    // rear++;
    // arr[rear] = data;
    // }

    // // remove
    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // int front = arr[0];
    // for (int i = 0; i < rear; i++) {
    // arr[i] = arr[i + 1];
    // }
    // rear--;
    // return front;
    // }

    // // peek
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }
    // return arr[0];

    // }
    // }

    // public static void main(String[] args) {
    // Queue q = new Queue(5);
    // q.add(1);
    // q.add(2);
    // q.add(3);

    // while (!q.isEmpty()) {
    // System.out.println(q.peek());
    // q.remove();
    // }

    // }

    // _______________________________CIRCULAR QUEUE______________________________

    // static class Queue {
    // static int arr[];
    // static int size;
    // static int rear;
    // static int front;

    // Queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // front = -1;
    // }

    // public static boolean isEmpty() {
    // return rear == -1 && front == -1;
    // }

    // public static boolean isFull() {
    // return (rear+1)%size == front;
    // }

    // // add
    // public static void add(int data) {
    // if (isFull()) {
    // System.out.println("Queue is full");
    // return;
    // }
    // //for 1st element
    // if (front == -1) {
    // front = 0;
    // }
    // rear = (rear + 1) % size;
    // arr[rear] = data;
    // }

    // // remove
    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // int result = arr[front];
    // //for single element
    // if (front == rear) {
    // rear = front = -1;
    // }
    // else {
    // front = (front + 1) % size;
    // }
    // return result;
    // }

    // // peek
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }
    // return arr[front];

    // }
    // }

    // public static void main(String[] args) {
    // Queue q = new Queue(5);
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // System.out.println(q.remove());
    // q.add(4);
    // System.out.println(q.remove());
    // q.add(5);

    // while (!q.isEmpty()) {
    // System.out.println(q.peek());
    // q.remove();
    // }

    // }

    // _______________________Using LINKED LIST________________________

    // static class Queue {
    // static class Node{
    // int data;
    // Node next;
    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }
    // static Node head = null;
    // static Node tail = null;

    // public static boolean isEmpty() {
    // return head == null && tail == null;
    // }

    // // add
    // public static void add(int data) {
    // Node newNode = new Node(data);
    // //for 1st element
    // if (head == null) {
    // head = tail = newNode;
    // return;
    // }
    // tail.next = newNode;
    // tail = newNode;
    // }

    // // remove
    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // int front = head.data;
    // //for single element
    // if (tail == head) {
    // tail = head = null;
    // }
    // else {
    // head = head.next;
    // }
    // return front;
    // }

    // // peek
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }
    // return head.data;

    // }
    // }

    // public static void main(String[] args) {
    // Queue q = new Queue();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // System.out.println(q.remove());
    // q.add(4);
    // System.out.println(q.remove());
    // q.add(5);

    // while (!q.isEmpty()) {
    // System.out.println(q.peek());
    // q.remove();
    // }

    // }
    // }




     
    // _______________________Using JAVA COLLECTIONS________________________

    // public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // System.out.println(q.remove());
    // q.add(4);
    // System.out.println(q.remove());
    // q.add(5);

    // while (!q.isEmpty()) {
    // System.out.println(q.peek());
    // q.remove();
    // }
    // }
    // }








// _______________________USing 2 Stacks for a Queue_____________________

// static  class Queue {
//     static Stack<Integer> s1 = new Stack<>();
//     static Stack<Integer> s2 = new Stack<>();

//     public static boolean isEmpty() {
//         return s1.isEmpty() ;  //we only check s1 as we dont put elements in s2 permanently
//     }

//     //add
//     public static void add(int data) {
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//          }
//             s1.push(data);
        
//             while(!s2.isEmpty()){
//             s1.push(s2.pop());
//          }
//         }
//     //remove
//     public static int remove() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         return s1.pop();
//         }
//     //peek
//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("empty queue");
//             return -1;
//         }
//         return s1.peek();
//         }
//     }
//         public static void main(String[] args) {
//             Queue q = new Queue();
//             q.add(1);
//             q.add(2);
//             q.add(3);
//             while (!q.isEmpty()) {
//                 System.out.println(q.peek());
//                 q.remove();
//             }
//     }

// }





// _______________________USing 2 Quesues for a Stack_____________________

// static class Stack {
//     static Queue<Integer> q1 = new LinkedList<>();
//     static Queue<Integer> q2 = new LinkedList<>();

//     public static boolean isEmpty() {
//         return q1.isEmpty() && q2.isEmpty();  //we only check s1 and s2 as we dont know which queue is empty
//     }

//     // add
//     public static void push(int data) {
//         if(!q1.isEmpty()){
//             q1.add(data);
//         }
//         else{
//             q2.add(data);
//         }
//     }
//     // remove
//     public static int pop() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         int top = -1;
//         //case-1
//         if(!q1.isEmpty()){ 
//             while(!q1.isEmpty()){
//                 top = q1.remove();
//                 if(q1.isEmpty()){
//                     break;
//                 }
//                 q2.add(top);
//             }
//         }
//         else{   //case-2
//             while(!q2.isEmpty()){
//                 top = q2.remove();
//                 if(q2.isEmpty()){
//                     break;
//                 }
//                 q1.add(top);
//             }
//         }
//         return top ;
//     }
//     // peek
//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("Stack is empty");
//             return -1;
//         }
//         int top = -1;
//         //case-1
//         if(!q1.isEmpty()){
//             while(!q1.isEmpty()){
//                 top = q1.remove();
//                 q2.add(top);
//             }
//         }
//         else{ //case-2
//             while(!q2.isEmpty()){
//                 top = q2.remove();
//                 q1.add(top);
//             }
//         }
//         return top ;
//     }
// }
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
 





// //______________________________First Non Repeating Character______________________
// public static void printNonRepeating(String str){
//     int freq[] = new int[26];
//     Queue<Character> q = new LinkedList<>();

//     for(int i=0; i<str.length(); i++){
//         char ch = str.charAt(i);
//         q.add(ch);
//         freq[ch - 'a']++;   
        
//         while(!q.isEmpty()){
//             //check if the front of the queue is repeating
//             //if yes, remove it from the queue
//             if(freq[q.peek() - 'a'] > 1){
//                 q.remove();
//             }
//             else{
//                 System.out.print(q.peek() + " ");
//                 break;
//             }
//         }
//         if(q.isEmpty()){
//             System.out.print(-1 + " ");
//         }
//     }

// }
// public static void main(String[] args) {
//     String str = "aabccxb";
//     printNonRepeating(str);
// }
// }



//______________________________Interleae 2 halves of Queue ______________________

public static void interleave(Queue<Integer> q){
    int size  = q.size();
    Queue<Integer> q1 = new LinkedList<>();

    //put first half in q1
    for(int i=0; i<size/2; i++){
        q1.add(q.remove());
    }
    
    while (!q1.isEmpty()) {

        //put 1st element of q1 in q
        q.add(q1.remove());
        //put 1st element of q in q1
        q.add(q.remove());
    }

}
public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);
    interleave(q);

    // Print the interleaved queue
    while (!q.isEmpty()) {
        System.out.print(q.remove() + " ");
    }
}
}