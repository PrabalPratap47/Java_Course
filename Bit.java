import java.util.Scanner;
public class Bit {
    
//----------------->Odd even using division

// public static void main(String[] args) {
    
//     System.out.println("Enter a number to check odd or even");
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     if(a%2==0){
//             System.out.println("even");
//             }
//     else{
//             System.out.println("odd");
//     }
// }
// }



//___________________odd even BIt manupulaton

// public static void main(String[] args) {
// int n = 1687;
// if((n & 1)==0){ 
//         System.out.println("even");
// }
// else{
//         System.out.println("odd");

//     }
// }
// }







//_____________To find a number is power of two or not

//  public static boolean powerOfTwo(int n){
//     return (n & (n-1))==0;
//  }
// public static void main(String[] args) {
//     System.out.println(powerOfTwo(6)); // true
// }
// }








//--------->Get ith bit (to get whats on the ith bit by producting by 1 on ith bit)

// public static void main(String[] args) {
//     int n =15;
//     int i = 2;
//     //int bitmask = 1<<i;
//     if((n & 1<<i) == 0){
//         System.out.println("Ith bit is 0");
// }
// else{
//     System.out.println("ith bit is 1");
// }
// }
// }








// //------------->Set ith bit (make the ith bit as 1 by adding 1 on ith bit)


//  (1)

// public static void main(String[] args) {
//     int n = 9;
//     int i = 1;
//     System.out.println(n | 1<<i);     
// }
// }   


// (2)

// public static int set(int n,int i){
//     int bitmask = 1<<i;
//     return n | bitmask;
// }
// public static void main(String[] args) {
//     // int n = 9;
//     // int i = 1;
//     // System.out.println(set(n,i));
//     System.out.println(set(9,1));
// }
// }











//------------>Clear Ith bit (To convert ith bit to 0 by negating the ith bit and producting it to n)


// public static int clear(int n,int i){
//     int bitmask = ~(1<<i);
//     return n & bitmask;
// }
// public static void main(String[] args) {
//     System.out.println(clear(10, 1));   
// }
// }





//--------------->Update ith Bit(if new bit is 0 then use clear ith bit to make the ith bit 0)
//                               (BUT if new bit is 1 use set ith bit to mske ith bit as 1)



// public static int clear(int n,int i){     //Clear ith bit function
//     int bitmask = ~(1<<i);
//     return n & bitmask;
// }

// public static int set(int n,int i){        //set ith bit function
//         int bitmask = 1<<i;
//         return n | bitmask;
//     }

// public static int update(int n,int i, int newbit){    //update function
//     if(newbit == 0){
//         return clear(n, i);
//     }
//     else{
//         return set(n, i);
//     }
// }

// public static void main(String[] args) {
//     System.out.println(update(10, 2, 1));   
// }
// }









//------------>Clear last i bits (we clear last bits of ith bit by using bitmask of (~0)<<i and prdoucting it with n )

// public static int Clear_last(int n,int i){
//     int bitmask = (~0)<<i;
//     return n & bitmask;
// }

// public static void main(String[] args) {
    
//     System.out.println(Clear_last(15, 2));
// }
// }







//-----------> Clear a range of bits(we clear range of bits by using bitmask of (~0)<<j+1 and (1<<i)-1 and doing OR b/w them and then doing AND operation with n)


// public static int Clear_range(int n,int i,int j){
//     int a = ((~0)<<j+1);
//     int b = (1<<i)-1;
//     int bitmask = a|b;
//     return n & bitmask;
// }
// public static void main(String[] args) {
//     int n = 12;
//     int i = 1;
//     int j = 2;
//     System.out.println(Clear_range(n, i, j));
// }
// }








// Count the number of set bits (if!=0 ,count+=count, n>>1 n right shift 1)

// public static void main(String[] args) {
//     int n = 10;
//     int count = 0;
//     while(n>0){
//         if((n & 1)!=0){   //check if LSB is 1
//             count ++;
//         }
//         n=n>>1;
//         }
//         System.out.println(count);
// }
// }






// //Fast Exponentiation 
// public static void main(String[] args) {
//     int a = 5;  //number
//     int n = 5;  //Power of number
//     int ans = 1;  //ans of it  
//     while (n>0) {
//     if((n & 1)!=0){     //to check LSB is 1
//         ans = ans * a;
//     }
//     a= a*a;             //if lsb not 1 directly come to this step
//     n=n>>1;
// }
//     System.out.println(ans);
//  }
// }








//Modular Exponentiation (2^5 % 13 => 32 % 13 = 6)
//  public static void main(String[] args) {
//     int a = 2;      //number
//     int n = 5;      //Power of number
//     int ans = 1;    //ans of it  
//     int x = 13;     // modulo number
//     while (n>0) {
//     if((n & 1)!=0){     //to check LSB is 1
//         ans = ans * a;
//     }
//     a= a*a;             //if lsb not 1 directly come to this step
//     n=n>>1;
// }
//     ans=ans%x;
//     System.out.println(ans);
//  }
// }
