// import java.util.*;
// class hello{
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

// import java.util.*;
// public class hello {
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

// import java.util.*;
// public class hello{
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
//   public class hello{
//      public static void main(String[] args) {
//          Scanner sc =  new Scanner(System.in);
//          int n = sc.nextInt();
//          int i = 0;
//          do {
//             System.out.print(i);
//             i++;
//          }while(i<=n);
//      }
//     }

// import java.util.*;
//   public class hello{
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
// public class hello {
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
//   public class hello{
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

//-------Prime Number range from 2 to n-------

// import java.util.*;

// public class hello {
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

import java.util.*;
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i = 2;i<n-1;i++){
            if(n%i==0){
               isprime = false;
            }
        }
        System.out.println(isprime);
    }
}