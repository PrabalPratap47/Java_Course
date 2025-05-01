// import java.util.Arrays;
// import java.util.Scanner;

// class sts {
//     static void calculateSpan(int price[], int n, int S[]) {
//         S[0] = 1;
//         for (int i = 1; i < n; i++) {
//             S[i] = 1;
//             for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--)
//                 S[i]++;
//         }
//     }

//     static void printArray(int arr[]) {
//         System.out.print(Arrays.toString(arr));
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of days: ");
//         int n = scanner.nextInt();

//         int price[] = new int[n];
//         System.out.println("Enter the stock prices for each day:");

//         for (int i = 0; i < n; i++) {
//             price[i] = scanner.nextInt();
//         }

//         int S[] = new int[n];
//         calculateSpan(price, n, S);

//         System.out.print("Span array: ");
//         printArray(S);

//         scanner.close();
//     }
// }

// import java.io.*; 
// import java.math.*; 
// import java.util.*; 
// class GFG { 
//     static void towerOfHanoi(int n, char from_rod, 
//                              char to_rod, char aux_rod) 
//     { 
//         if (n == 0) { 
//             return; 
//         } 
//         towerOfHanoi(n - 1, from_rod, aux_rod, to_rod); 
//         System.out.println("Move disk " + n + " from rod "
//                            + from_rod + " to rod "
//                            + to_rod); 
//         towerOfHanoi(n - 1, aux_rod, to_rod, from_rod); 
//     } 
  
//     // Driver code 
//     public static void main(String args[]) 
//     { 
//         int N = 3; 
  
//         // A, B and C are names of rods 
//         towerOfHanoi(N, 'A', 'C', 'B'); 
//     } 
// } 
  
// import java.util.Scanner;

// class Node {
//     int data;
//     Node prev;
//     Node next;

//     public Node(int data) {
//         this.data = data;
//         this.prev = null;
//         this.next = null;
//     }
// }

// class sts {
//     private Node head;

//     public sts() {
//         this.head = null;
//     }

//     // Add a node to the end of the doubly linked list
//     public void append(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node current = head;
//             while (current.next != null) {
//                 current = current.next;
//             }
//             current.next = newNode;
//             newNode.prev = current;
//         }
//     }

//     // Display the doubly linked list
//     public void display() {
//         Node current = head;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         sts dll = new sts();
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = scanner.nextInt();

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < n; i++) {
//             int data = scanner.nextInt();
//             dll.append(data);
//         }

//         System.out.println("Doubly Linked List:");
//         dll.display();

//         scanner.close();
//     }
// }


// import java.util.*;

// class Node {
//     Node next;
//     Node prev;
//     String data;
//     int priority;

//     Node(String s, int p) {
//         data = s;
//         priority = p;
//     }
// }

// class Main {
//     Node head, tail;

//     void insert(String s, int p) {
//         Node n = new Node(s, p);

//         if (head == null) {
//             head = tail = n;
//         } else if (p < head.priority) {
//             head.prev = n;
//             n.next = head;
//             head = n;
//         } else {
//             Node current = head;
//             while (current.next != null && current.next.priority < p) {
//                 current = current.next;
//             }
//             n.prev = current;
//             n.next = current.next;
//             if (current.next != null) {
//                 current.next.prev = n;
//             } else {
//                 tail = n;
//             }
//             current.next = n;
//         }
//     }

//     void peek() {
//         if (head == null) {
//             System.out.println("The list is empty");
//         } else {
//             System.out.println(head.data + " (" + head.priority + ")");
//         }
//     }

//     public static void main(String[] args) {
//         Main m = new Main();
//         m.insert("Task A", 3);
//         m.insert("Task B", 1);
//         m.insert("Task C", 2);
//         m.peek();
//     }
// }







// import java.util.LinkedList; 
// import java.util.Queue; 
// class sts
// { 
	
// 	public static int minIndex(Queue<Integer> list, 
// 									int sortIndex) 
// 	{ 
// 	int min_index = -1; 
// 	int min_value = Integer.MAX_VALUE; 
// 	int s = list.size(); 
// 	for (int i = 0; i < s; i++) 
// 	{ 
// 		int current = list.peek(); 
		
		
// 		list.poll(); 

// 		if (current <= min_value && i <= sortIndex) 
// 		{ 
// 			min_index = i; 
// 			min_value = current; 
// 		} 
// 		list.add(current); 
// 	} 
// 	return min_index; 
// } 
	
// 	public static void insertMinToRear(Queue<Integer> list, 
// 											int min_index) 
// 	{ 
// 		int min_value = 0; 
// 		int s = list.size(); 
// 		for (int i = 0; i < s; i++) 
// 		{ 
// 		int current = list.peek(); 
// 		list.poll(); 
// 		if (i != min_index) 
// 			list.add(current); 
// 		else
// 			min_value = current; 
// 		} 
// 		list.add(min_value); 
// 	} 
	
// 	public static void sortQueue(Queue<Integer> list) 
// 	{ 
// 		for(int i = 1; i <= list.size(); i++) 
// 		{ 
// 			int min_index = minIndex(list,list.size() - i); 
// 			insertMinToRear(list, min_index); 
// 		} 
// 	} 

// 	public static void main (String[] args) 
// 	{ 
// 		Queue<Integer> list = new LinkedList<Integer>(); 
// 		list.add(30); 
// 		list.add(11); 
// 		list.add(15); 
// 		list.add(4); 
		
// 		//Sort Queue 
// 		sortQueue(list); 
		
// 		//print sorted Queue 
// 		while(list.isEmpty()== false) 
// 		{ 
// 			System.out.print(list.peek() + " "); 
// 			list.poll(); 
// 		} 
// 	} 
// } 




// import java.util.*;
// class sts{
    
//     static void sortQueue(Queue<Integer> q){
//         int n = q.size();
//         for (int i=0;i<n;i++){
//             int minVal = Integer.MAX_VALUE;
//             int minInd= -1;
//             for (int j=0;j<n ;j++){
//                 int current = q.poll();
//                 if (current<minVal && j<(n-i)){
//                     minVal=current;
//                     minInd=j;
//                 }
//                 q.add(current);
//             }
//             for (int j=0;j<n;j++){
//                 int current = q.poll();
//                 if (minInd!=current)
//                 {
//                     q.add(current);
//                 }
//             }
//             q.add(minVal);
//         }
//         System.out.println(q);
//     }
    
//     public static void main(String[] args){
//         Queue<Integer> q = new LinkedList<Integer>();
//         q.add(10);
//         q.add(7);
//         q.add(8);
//         q.add(2);
//         q.add(6);
//         sortQueue(q);
//         //System.out.println(q);
//     }
// }

import java.util.*;
public class Main{
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int visitDays[] = new int[size];
        
        for(int i=0;i<=size && i<=365;i++){
            visitDays[i]=sc.nextInt();
        }

        for(int i=0;i<=size;i++){
            visitDays[i]=sc.nextInt();
        }
    }
}