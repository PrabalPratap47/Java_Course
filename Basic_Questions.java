// import java.util.*;
// class Basic_questions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char e = 'd';
//         int a = 10;
//         float b = 25.25f;
//         long  c = 25;
//         double d = 30;
//         System.out.println(e+b+a+c+d);
//     }
// }



//______________Leap Year______________

// import java.util.*;
// public class Basic_questions {
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Input the year: ");
//     int year = sc.nextInt();
//     boolean x = (year % 4) == 0;
//     boolean y = (year % 100) != 0;
//     boolean z = ((year % 100 == 0) && (year % 400 == 0));
//     if (x && (y || z)) {
//         System.out.println(year + " is a leap year");
//     } else {
//         System.out.println(year + " is not a leap year");
//         }   
//     }
// }







//__________ Reverse a number using while loop__________

// import java.util.*;
// public class Basic_questions{
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//         int n = sc.nextInt();
//         int reverse = 0;
//         while(n > 0){
//             int lastdigit = n % 10;
//             reverse = (reverse*10) + lastdigit;
//             n = n /10;

//         }
//         System.out.print(reverse);
//     }
// }



//  import java.util.*;
//   public class Basic_questions{
//      public static void main(String[] args) {
//          Scanner sc =  new Scanner(System.in);
//          int n = sc.nextInt();
//          int i = 0;
//          do {
//             System.out.print(i+"");
//             i++;
//          }while(i<=n);
//      }
//     }



// import java.util.*;
//   public class Basic_questions{
//      public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//          while (true){
//             System.out.print("enter number :");
//             int n = sc.nextInt();
//             if(n % 10 == 0){
//                 break;
//             }
//              else{
//                 System.out.println("number entered : " + n );
//          }

//          }
//     }
//   }



// import java.util.Scanner;
// public class Basic_questions {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//             int n = scanner.nextInt();
//         for(int i = 0;n>=i;i++) { //use for loop
//             if (i == 3) {
//                 continue;
//             } 
//             System.out.println(i);
//         }

//     }
// }




// import java.util.*;
//   public class Basic_questions{
//      public static void main(String[] args) {
//         Scanner sc =  new Scanner(System.in);
//          while (true){
//             System.out.print("enter number :");
//             int n = sc.nextInt();
//             if(n % 10 == 0){
//                 continue;
//             }
//              else{
//                 System.out.println("number entered : " + n );
//          }

//          }

//     }
//   }



//print table of any num till 10

// import java.util.*;
// public class Basic_questions { 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to print its table: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             int x = n * i;
//             System.out.println(n + " * " + i + " = " + x);
//     }
// }
// }




//factorial of a number using for loop

// import java.util.*;
// public class Basic_questions {
//    public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter a number to find its factorial: ");
//          int n = sc.nextInt();
//          int fact = 1;
//          for (int i = 1; i <= n; i++) {
//             fact *= i; // fact = fact * i
//          }
//          System.out.println("Factorial of " + n + " is: " + fact);
//       }
//    }





//-------Prime Number range from 2 to n-------

// import java.util.*;

// public class Basic_questions {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to check if it is prime: ");
//         int n = sc.nextInt();

//         for (int i = 2; i <= n; i++) {
//             boolean isprime = true;

//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isprime = false;
//                     break;
//                 }
//             }
//             if (isprime) {
//                 System.out.println(i + " is a prime number");
//             }
//         }
//     }
// }


//________________Prime Number_________________

// import java.util.*;
// public class Basic_questions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to check if it is prime: ");
//         int n = sc.nextInt();
//         boolean isprime = true;
//         for(int i = 2;i<n-1;i++){
//             if(n%i==0){
//                isprime = false;
//             }
//         }
//         System.out.println(isprime);
//     }
// }





//----------------------->see start patterns




























//              PRACTICE
// import java.util.*;
// public class Basic_questions {
// public static void main(String[]args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int n = sc.nextInt();
//     int rev = 0;
    
//     while(n>0){
//         int rem = n%10; // Get the last digit
//         rev = (rev*10) + rem; // Build the reversed number
//         n = n/10; // Remove the last digit from n
//     }
    
//     System.out.println(");
// }
// }
