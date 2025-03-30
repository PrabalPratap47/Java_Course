//------------> Decreasing func.


// public class Recursion{
// public static void decrease(int n) {
//     if (n == 1) {                    //base casw , without it we can't finish
//         System.out.println(n);
//         return;
// }
// System.out.println(n +" ");
// decrease(n-1);               //here it will print the number 1st then decrease the number when calling the function then again print and call so the numbers will print from 10 to 1

// }

// public static void main (String args[]){
//     int n =10;
//     decrease(n);
// }
// }














// //------------> Increasing func.
// public class Recursion{
//     public static void Increase(int n) {
//         if (n == 1) {
//             System.out.println(n);
//             return;
//     }
//     Increase(n-1);            //here it will call the function again and again till the value reaches 1 then it will return; and print all numbers from 1 to 10
//     System.out.println(n +" ");
    
//     }
    
//     public static void main (String args[]){
//         int n =10;
//         Increase(n);
//     }
//     }











//------------> FActorial func.

// public class Recursion{
//     public static int factorial(int n) {
//         if (n == 0) {
//             return 1;
//     }
//     factorial(n-1);
//     int fac = n*factorial(n-1);
//     return fac;            // (understand its stack analysis) OR here it will call the function again and again till the value reaches 0 then it will return 1 then that 1 is multiplied with next number and goes on and rwturns 120
    
//     }
    
//     public static void main (String args[]){
//         int n =5;
//         System.out.println(factorial(n));
//     }
//     }











//------------> Sum of first n numbers.

// public class Recursion{
//     public static int factorial(int n) {
//         if (n == 0) {
//             return 0;
//     }
//     factorial(n-1);
//     int fac = n+factorial(n-1);
//     return fac;            // (understand its stack analysis) OR here it will call the function again and again till the value reaches 0 then it will return 0 then that 1 is added with next number and goes on and rwturns 15 
    
//     }
    
//     public static void main (String args[]){
//         int n =5;
//         System.out.println(factorial(n));
//     }
//     }










//-------------> Check if array is sorted or not ?

// public class Recursion{
//     public static boolean isSorted(int[] arr, int i) {
//         if(i==arr.length-1){
//             return true;
//         }

//         if(arr[i]>arr[i+1]){
//         return false;
//     }
    
//     return isSorted(arr, i+1);
// }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 8, 5};
//         System.out.println(isSorted(arr, 0));
//     }
// }

  














// //-------------->FirstOcuurence of (index) key in array
// public class Recursion{
//     public static int index(int arr[],int key, int i){
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return index(arr,key,i+1);


//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 4, 0, 2, 5,};
//         // int key = 4;
//         // int i=0;
//         // System.out.println(index(arr,key,i));

//         System.out.println(index(arr, 4, 0));
//     }
// }









 //-------------->LastOcuurence of (index) key in array

// public class Recursion{
//     public static int LastOcuurence(int arr[],int key,int i) {
//         if(i==arr.length){
//             return -1;
//         }
//         int isFound = LastOcuurence(arr, key, i+1);

//         if(isFound != -1){
//             return isFound;
//         }

//         if(arr[i]==key){
//             return i;
//             }

//         return isFound;

        
//     }
//     public static void main(String[] args) {
//         int arr [] = {1,2,3,4,5,1};
//         System.out.println(LastOcuurence(arr,2,0));

//     }
// }





//---------------> X^n using recusion
// public class Recursion{
//     public static int calculate(int x,int n){
        
//         //base case
//         if(n==0){
//             return 1;
//         }

//         //recursive case 
//         int xnm = calculate(x,n-1);
//         int xn = x*xnm;
//         return xn;

//     }
// public static void main(String[] args) {
//     int x,n;
//     System.out.println(calculate(2, 10));
    
// }
// }







//--------------->Tilling problem
public class Recursion{
    public static int countways(int n){
        if(n==0 || n==1){
            return 1;
        }
        int tiling1way = countways(n-1);
        int tiling2way = countways(n-2);
        return tiling1way + tiling2way;
        //int totalCount = tiling1way+tiling2way;
        // return totalCount;
    }
    public static void main(String[] args) {
        System.out.println(countways(4));
        
    }
}
