package Java_Course;
// import java.util.*;

// public class Problems {

//     // //Enter 3 numbers from the user & make a function to print their average
//     // public static int Printavg(int a,int b, int c){
//     //     int avg = (a+b+c)/3 ;
//     //     return avg;
//     // }
//     // public static void main(String[] args) {
//     //     Scanner sc = new Scanner(System.in);
//     //     int a = sc.nextInt();
//     //     int b = sc.nextInt();
//     //     int c = sc.nextInt();

//     //     int avg = Printavg(a,b,c);

//     //     System.out.println(avg);
//     // }

    
    

//     //Write a function to print the sum of all odd numbers from 1 to n.
//     // Output Printing Type-1 


//     // public static int Printsum(int n){
//     //     int sum = 0;

//     //     for(int i = 1; i<=n;i++){
//     //         if(i % 2 != 0){
//     //             sum = sum + i;
//     //         }
//     //     }
//     //     System.out.println(sum);
//     //     return sum;
//     // }
//     // public static void main(String[] args) {
//     //     Scanner sc = new Scanner(System.in);
//     //     int n = sc.nextInt();
//     //     Printsum(n);
//     // }





//     //Write a function which takes in 2 numbers and returns the greater of those two.
//     // Output Printing Type-2 

//     // public static  int printsum(int a, int b){
//     //     if(a>b){
//     //         return a;
//     //     }
//     //     else{
//     //         return b;
//     //     }
//     // }
//     //     public static void main(String agrs[]){
//     //         Scanner sc = new Scanner(System.in);
//     //         int a = sc.nextInt();
//     //         int b = sc.nextInt();
//     //         System.out.println(printsum(a, b));
            
//     //     }
    
    


//     // Write a function that takes in the radius as input and returns the circumference of a circle.

//     // Output Printing Type-3
//     // public static double printrad(double r){
//     //     double circumference = 2 * 3.14 *r;
//     //     return circumference;
        
//     // }
//     // public static void main(String[]args){
//     //     Scanner sc = new Scanner(System.in);
//     //     double r = sc.nextInt();

//     //     double cir = printrad(r);
//     //     System.out.println(cir);
//     // }



//     // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
//     
// public static void printvote(int n){
//     //     if(n>18){
//     //         System.out.println("eligible");
//     //     }
//     //     else{
//     //         System.out.println("not eligible");

//     //     }
//     // }
//     // public static void main(String[]args){
//     //     Scanner sc = new Scanner(System.in);
//     //      int n  = sc.nextInt();
//     //      printvote(n);

//     // }

// //     //Write an infinite loop using do while condition.
// //    public static void main(String args[]) {
// //     int n = 0;
// //       do {System.out.println("pps");
// //           n++;

// //       } while(n<=3);
// //    }   


// //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    
// public static void main(String[]args){
//     int p = 0;
//     int n = 0;
//     int z = 0;
//     System.out.println("Press 1 to Continue and 0 to Stop");
//     Scanner sc = new Scanner(System.in);
//     int input = sc.nextInt();
//     while(input==1){
//         System.out.println("enter your number");
//         int num = sc.nextInt();
//         if(num<0){
//             n++;
//         }
//         else if(num>0){
//             p++;
//         }
//         else{
//             z++;
//         }
//         System.out.println("Press 1 to Continue and 0 to Stop"); 
//          input = sc.nextInt();
//     }

//     System.out.println("Negatives " + n);
//     System.out.println("Positives " + p);
//     System.out.println("Zeors " + z);

//     }

// //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// //    public static void main(String args[]) {
// //        System.out.println("Enter x");
// //        Scanner sc = new Scanner(System.in);
// //        int x = sc.nextInt();
// //        System.out.println("Enter n");
// //        int n = sc.nextInt();


// //        int result = 1;
// //        //Please see that n is not too large or else result will exceed the size of int
// //        for(int i=0; i<n; i++) {
// //            result = result * x;
// //        }
       
// //        System.out.println("x to the power n is : "+ result);
// //    }   
// }



// public class Main{
//     public static void main(String[] args){
//         int a = 5;
//         a +=5;
//         Switch(a){
//             case 5:
//                 System.out.print("5");
//                 break;
//             case 10:
//                 System.out.print("10");
//             default:
//                 System.out.print("0");
//         }
        
//     }
// }





import java.util.*;
public class Problems
{
    public static void main(String[] args)
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("Hello");
            i++;
        }
    }
}










