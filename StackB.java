import java.util.*;

public class StackB {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();
        
        //return true if list is empty
        public static boolean isEmpty() {
            return list.isEmpty();
        }

        //push -: automatically add the data to the last of list ie;at the top of stack
        public static void push(int data) {
            list.add(data);
        }

        //pop -: remove the last element of list ie;top of stack
        public static int pop() {
            
    }
}
