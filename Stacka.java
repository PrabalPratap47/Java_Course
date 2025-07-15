import java.util.*;
// import java.util.ArrayList; // for implementing stack using ArrayList

import javax.print.DocFlavor.STRING;

public class Stacka {


    

    // _____________Implementing stack using ArrayList___________________________

    // static class Stack {

    // static ArrayList<Integer> list = new ArrayList<Integer>();

    // // return true if list is empty
    // public static boolean isEmpty() {
    // return list.size() == 0;
    // }

    // // push -: automatically add the data to the last of list ie;at the top of
    // stack
    // public static void push(int data) {
    // list.add(data);
    // }

    // // pop -: remove the last element of list ie;top of stack
    // public static int pop() { // we gave int as whatever the data is deleted it
    // gets saved and returned
    // if (isEmpty()) {
    // return -1; // if stack is empty
    // }
    // int top = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // return top;
    // }

    // public static int peek() { // return the last element of list
    // if (isEmpty()) {
    // return -1; // if stack is empty
    // }
    // return list.get(list.size() - 1);
    // }
    // }

    // public static void main(String args[]) {
    // Stack s = new Stack();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);

    // while (!s.isEmpty()) {
    // System.out.println(s.peek());
    // s.pop();

    // }









    // _______________Implementing Stack using LinkedList______________________________

    // static class Node {
    // int data;
    // Node next;
    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // static class Stack {
    // static Node head = null; // head of the list

    // // return true if list is empty
    // public static boolean isEmpty() {
    // return head == null;
    // }

    // // push -: automatically add the data to the last of list ie;at the top of
    // stack
    // public static void push(int data) {
    // Node newNode = new Node(data);
    // if (isEmpty()) {
    // head = newNode;
    // return;
    // }
    // newNode.next = head; // point the new node to the current head
    // head = newNode;
    // }

    // //pop -: remove the last element of list ie;top of stack
    // public static int pop() { // we gave int as whatever the data is deleted it
    // gets saved and returned
    // if (isEmpty()) {
    // return -1; // if stack is empty
    // }
    // int top = head.data;
    // head = head.next; // move the head to the next node
    // return top;
    // }

    // // peek -: return the last element of list
    // public static int peek() {
    // if (isEmpty()) {
    // return -1; // if stack is empty
    // }
    // return head.data; // return the data of the head node
    // }
    // }

    // public static void main(String args[]) {
    // Stack s = new Stack();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);

    // while (!s.isEmpty()) {
    // System.out.println(s.peek());
    // s.pop();

    // }

    // }
    // }

    // ____________Using java collection framework__________________________________

    // public static void main(String args[]) {

    // Stack<Integer> s = new Stack<>();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);
    // s.push(5);

    // while (!s.isEmpty()) {
    // System.out.println(s.peek());
    // s.pop();

    // }
    // }
    // }

    // _________________________Push at Bottom of stack____________________________

    // public static void pushAtBottom(Stack<Integer> s, int data) {
    // if (s.isEmpty()) {
    // s.push(data); // this happens once
    // return; // after this, no more `int top = s.pop();`
    // }
    // int top = s.pop(); // remove the top element // skipped if if-condition is
    // true
    // pushAtBottom(s, data); // recursively call the function
    // s.push(top); // push the top element back // resumes here after recursion
    // unwinds
    // }

    // public static void main(String[] args) {
    // Stack<Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);

    // pushAtBottom(s,4 ); // push 4 at the bottom of stack
    // // print the stack
    // while (!s.isEmpty()) {
    // System.out.println(s.peek());
    // s.pop();
    // }
    // }
    // }

    // _________________________Reverse a string using stack______________________

    // public static String reverseString(String str) {
    // Stack<Character> s = new Stack<>();

    // // push all characters of string to stack
    // for (int i = 0; i < str.length(); i++) {
    // s.push(str.charAt(i));
    // }
    // // pop all characters from stack and print them
    // StringBuilder reversed = new StringBuilder();
    // while (!s.isEmpty()) {
    // char curr = s.pop();
    // reversed.append(curr);
    // }
    // return reversed.toString();
    // }

    // public static void main(String[] args) {
    // String str = "Hello, World!";
    // String reversedStr = reverseString(str);
    // System.out.println("Original String: " + str);
    // System.out.println("Reversed String: " + reversedStr);

    // }
    // }

    // _______________________reverse a stack___________________________

    // --------------using other stack
    // public static void main(String[] args) {
    // Stack<Integer> original = new Stack<>();
    // Stack<Integer> reversed = new Stack<>();

    // // Push elements
    // original.push(1);
    // original.push(2);
    // original.push(3);

    // System.out.println("Original Stack: " + original); //prints from bottom to
    // top, not top to bottom.

    // // Reverse
    // while (!original.isEmpty()) {
    // reversed.push(original.pop());
    // }

    // System.out.println("Reversed Stack: " + reversed);
    // }
    // }

    // --------------Using recursion

    // static void reverse(Stack<Integer> stack) {
    // if (!stack.isEmpty()) {
    // int temp = stack.pop();
    // reverse(stack);
    // insertAtBottom(stack, temp);
    // }
    // }

    // static void insertAtBottom(Stack<Integer> stack, int value) {
    // if (stack.isEmpty()) {
    // stack.push(value);
    // return;
    // }
    // int temp = stack.pop();
    // insertAtBottom(stack, value);
    // stack.push(temp);
    // }

    // public static void main(String[] args) {
    // Stack<Integer> stack = new Stack<>();
    // stack.push(1);
    // stack.push(2);
    // stack.push(3);

    // System.out.println("Original Stack: " + stack); //prints from bottom to top,
    // not top to bottom.

    // reverse(stack);
    // System.out.println("Reversed Stack: " + stack);
    // }
    // }

    // ________________Stock Span______________________

    // public static void stockspan(int stock[], int span[]) {
    // Stack<Integer> s = new Stack<>();
    // s.push(0); // push the first index
    // span[0] = 1; // span of first element is always 1

    // for (int i = 1; i < stock.length; i++) {
    // int currPrice = stock[i];
    // while (!s.isEmpty() && currPrice >= stock[s.peek()]) {
    // // pop the elements from stack until the current price is less than or equal
    // to the price at the top of the stack
    // s.pop();
    // }
    // if (s.isEmpty()) {
    // span[i] = i + 1;
    // } else {
    // span[i] = i - s.peek();
    // }
    // s.push(i);
    // }
    // }
    // public static void main(String[] args) {
    // int stock[] = { 100, 80, 60, 70, 60, 85,100 };
    // int span[] = new int[stock.length];
    // stockspan(stock, span);

    // for (int i = 0; i < span.length; i++) {
    // System.out.println("Stock Price: " + stock[i] + ", Span: " + span[i]);
    // }
    // }}



    // ________________Next greater element on right______________________
    // this code can be used for many other forms like , Next greater on left, Nxt
    // smaller on right, Next smaller on left etc.

    // public static void main(String[] args) {
    // int[] arr = {6,8,0,1,3};
    // Stack<Integer> s = new Stack<>();
    // int[] nextGreater = new int[arr.length];

    // for (int i = arr.length-1; i >= 0; i--) {

    // // 1 While
    // while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
    // s.pop();
    // }

    // // 2 If-else
    // nextGreater[i] = s.isEmpty() ? -1 : arr[s.peek()];

    // // 3 Push
    // s.push(i);
    // }

    // // Print the result
    // for (int i = 0; i < arr.length; i++) {
    // System.out.println("Next greater element for " + arr[i] + " is: " +
    // nextGreater[i]);
    // }
    // }
    // }





    // _____________________________Valid Parentheses___________________________

    // public static boolean isValid(String str) {
    // Stack<Character> s = new Stack<>();
    // // iterate through the string
    // for (int i = 0; i < str.length(); i++) {
    // char curr = str.charAt(i);

    // // check if the current character is an opening bracket
    // // if it is, push it onto the stack
    // if (curr == '(' || curr == '{' || curr == '[') {
    // s.push(curr);

    // } else {
    // // check if stack is empty after push return false
    // if (s.isEmpty()) {
    // return false;
    // }

    // // check if the current character is a closing bracket
    // // if it is, check if the top of the stack is the corresponding opening
    // bracket
    // if ((curr == ')' && s.peek() == '(') ||
    // (curr == '}' && s.peek() == '{') ||
    // (curr == ']' && s.peek() == '[')) {
    // s.pop(); // if it is, pop the top of the stack
    // } else {
    // return false; // if it is not, return false
    // }
    // }
    // }
    // // check if the stack is empty at the end
    // // if it is, return true
    // // if it is not, return false
    // if(s.isEmpty()) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static void main(String[] args) {
    // String str = "{[{[()]}}";
    // System.out.println("Is the string valid? " + isValid(str));
    // }
    // }

    // ______________________Duplicate Parenthesis____________________

//     public static boolean isDuplicate(String str) {
//         Stack<Character> s = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char curr = str.charAt(i);

//             // if the current character is a closing bracket
//             if (curr == ')') {
//                 int count = 0;
                
//                 while (s.peek() != '(') {
//                     s.pop();
//                     count++;
//                 }
//                 if (count < 1) {
//                     return true; // duplicate parenthesis found
//                 } else {
//                     s.pop();
//                 } // pop the opening bracket
//             } 
            
//             else {
//                 s.push(curr); // push the current character onto the stack
//             }
//         }
//         return false; // no duplicate parenthesis found
//     }

//     public static void main(String[] args) {
//         String str1 = "((a+b))"; // true
//         String str2 = "(a+b)"; // false
//         System.out.println("Is the string " + str1 + " valid? " + isDuplicate(str1));
//         System.out.println("Is the string " + str2 + " valid? " + isDuplicate(str2));
//     }
// }



// ___________________________Max area of Rectangle______________________________

public static void maxArea(int[] arr) {
    Stack<Integer> s = new Stack<>();
    int maxArea = 0;
    int nsr[] = new int[arr.length]; // next smaller right
    int nsl[] = new int[arr.length]; // next smaller left
    

    // Next smaller Right
    
    for(int i=arr.length-1; i>=0; i--) {
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
            s.pop();
        }
        if(s.isEmpty()) {
            nsr[i] = arr.length;
        } else {
            nsr[i] = s.peek();
        }
        s.push(i);
    }

    // Next smaller Left
    for(int i=0; i<arr.length; i++) {
        while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
            s.pop();
        }
        if(s.isEmpty()) {
            nsl[i] = -1;
        } else {
            nsl[i] = s.peek();
        }
        s.push(i);
    }
    // Calculate max area

    for(int i=0; i<arr.length; i++) {
        int height = arr[i];
        int width = nsr[i] - nsl[i] - 1;
        int area = height * width;
        maxArea = Math.max(maxArea, area);
    }

    System.out.println("Max area of rectangle is: " + maxArea);
}

public static void main(String args[]) {
    int[] arr = {2, 1, 5, 6, 2, 3};
    maxArea(arr);
}
}
