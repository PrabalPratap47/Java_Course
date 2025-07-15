import java.util.*;


//Prabal
public class AL {
    // public static void main(String[] args) {
    // // Create an ArrayList
    // ArrayList <Integer> list = new ArrayList <> ();
    // //input
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // //output
    // System.out.println(list);

    // //another way of input
    // list.add(1,6);
    // System.out.println(list);

    // //Get Element
    // int element = list.get(0);
    // System.out.println(element);

    // //delete element
    // list.remove(3);
    // System.out.println(list);

    // // //set element
    // list.set(0, 10);
    // System.out.println(list);

    // // //contains
    // boolean contains = list.contains(10);
    // System.out.println(contains);
    // System.out.println(list.contains(11));

    // --------------->To get Size of arrayList

    // int size = list.size();
    // System.out.println(size);

    // //to use loop
    // for (int i = 0; i < list.size(); i++) {
    // System.out.print(list.get(i)+" ");
    // }
    // }

    // //---------------------------->Swap 2 numbs

    // public static void swap(ArrayList <Integer> list,int indx1,int indx2){ //this
    // is how we pass arraylist in function
    // int temp = list.get(indx1);
    // list.set(indx1, list.get(indx2));
    // list.set(indx2, temp);
    // }

    // public static void main(String[] args) {
    // // Create an ArrayList
    // ArrayList <Integer> list = new ArrayList <> ();
    // //input
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // //output
    // System.out.println(list);

    // int indx1 =1 , indx2 =3; //assign index

    // swap(list, indx1, indx2);
    // System.out.println(list);

    // }
    // }

    // ------------------->sorting in AL

    // public static void main(String[] args) {
    // // Create an ArrayList
    // ArrayList <Integer> list = new ArrayList <> ();
    // //input
    // list.add(1);
    // list.add(3);
    // list.add(0);
    // list.add(8);
    // list.add(7);
    // //output
    // System.out.println(list);

    // //for ascending order
    // Collections.sort(list);
    // System.out.println(list);

    // //for decending order
    // Collections.sort(list,Collections.reverseOrder());
    // System.out.println(list);

    // }

    // }

    // ---------------------------->Multi-Dimension Array List

    // public static void main(String[] args) {
    // Create a 2D ArrayList
    // ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();
    // //input
    // ArrayList<Integer>list = new ArrayList<>();
    // list.add(1); list.add(2);
    // Mainlist.add(list);

    // ArrayList<Integer>list2 = new ArrayList<>();
    // list2.add(3); list2.add(4);
    // Mainlist.add(list2);

    // for(int i =0;i<Mainlist.size();i++){
    // ArrayList<Integer> currlist = Mainlist.get(i); // fetches the list one by one
    // and stores it in currlist

    // //now we can print each list one by one
    // for(int j = 0;j<currlist.size();j++){
    // System.out.print(currlist.get(j)+" ");
    // }
    // System.out.println();
    // }

    // //we can print whole main list
    // System.out.println(Mainlist);
    // }
    // }

    // __________Multiple Inputs____________________

    // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

    // ArrayList<Integer>list1 = new ArrayList<>();
    // ArrayList<Integer>list2 = new ArrayList<>();
    // ArrayList<Integer>list3 = new ArrayList<>();

    // //input
    // for(int i=1;i<=5;i++){
    // list1.add(i*1);
    // list2.add(i*2);
    // list3.add(i*3);
    // }

    // mainlist.add(list1);
    // mainlist.add(list2);
    // mainlist.add(list3);

    // for(int i =0;i<mainlist.size();i++){
    // ArrayList<Integer> currlist = mainlist.get(i); // fetches the list one by one
    // //now we can print each list one by one
    // for(int j = 0;j<currlist.size();j++){
    // System.out.print(currlist.get(j)+" ");
    // }
    // System.out.println();
    // }
    // System.out.println(mainlist);

    // }
    // }

    // _______________Water Container Problem_____T.C = O(n^2)________________

    // public static void main(String[]args){
    // ArrayList<Integer> height = new ArrayList<>();
    // height.add(1);
    // height.add(8);
    // height.add(6);
    // height.add(2);
    // height.add(5);
    // height.add(4);
    // height.add(8);
    // height.add(3);
    // height.add(7);

    // //find pairs
    // int maxwater=0;
    // for(int i =0;i<height.size();i++){
    // for(int j = i+1;j<height.size();j++){
    // //calculate height(min), width
    // int h = Math.min(height.get(i),height.get(j));
    // int w = j-i;
    // int currwater = h*w;
    // //find max of area and put in area
    // maxwater = Math.max(maxwater, currwater);
    // }
    // }
    // System.out.println(maxwater);

    // }
    // }

    // _______________Same Ques- 2 Pointer approach ,, T.C = (n)______________

    // public static int storewater(ArrayList<Integer> height) {

    // int maxwater = 0;
    // int lp = 0;
    // int rp = height.size() - 1;

    // while (lp < rp) {
    // int h = Math.min(height.get(lp), height.get(rp));
    // int w = rp - lp;
    // int currwater = h * w;
    // maxwater = Math.max(maxwater, currwater);

    // if (height.get(lp) < height.get(rp)) {
    // lp++;
    // } else {
    // rp--;
    // }
    // }

    // return maxwater;
    // }

    // public static void main(String[] args) {
    // ArrayList<Integer> height = new ArrayList<>();
    // height.add(1);
    // height.add(8);
    // height.add(6);
    // height.add(2);
    // height.add(5);
    // height.add(4);
    // height.add(8);
    // height.add(3);
    // height.add(7);

    // System.out.println(storewater(height));
    // }
    // }

    // ________________________Pair Sum___________

    // Brute force

    // public static int pairsSum(ArrayList<Integer> list, int target) {
    // int pairs = 0; // Number of pairs
    // Collections.sort(list); // Sort list for efficiency

    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // pairs++; // Count valid pairs
    // System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
    // }
    // }
    // }
    // return pairs; // Return total count of pairs
    // }

    // public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(5);
    // list.add(2);
    // list.add(4);
    // list.add(5);
    // list.add(6);
    // list.add(7);

    // int target = 7;
    // System.out.println("Total Pairs: " + pairsSum(list, target));
    // }
    // }

    // ______________ ___2 pointer approach

    // public static int pairSum( ArrayList<Integer> list, int target){

    // Collections.sort(list);
    // int pairs = 0;
    // //assigning pointers
    // int lp = 0;
    // int rp = list.size() - 1;

    // while (lp < rp) {
    // int sum = list.get(lp) + list.get(rp);
    // if (sum == target) {
    // pairs++;
    // lp++;
    // rp--;
    // } else if (sum < target) {
    // lp++;
    // } else {
    // rp--;
    // }
    // }
    // return pairs;

    // }

    // public static void main(String[] args) {
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(5);
    // list.add(2);
    // list.add(4);
    // list.add(5);
    // list.add(6);
    // list.add(3);
    // list.add(0);
    // list.add(7);

    // int target = 7;
    // System.out.println("Total Pairs: " + pairSum(list, target));
    // }
    // }

    // _______________2 pair sum sorted and rotated

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        int pivot = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        // assigning pointers
        int lp = pivot + 1;
        int rp = pivot;

        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp)==target) {
                return true;
            }
            // case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // case 3
            else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSum(list, target));
    }
}
