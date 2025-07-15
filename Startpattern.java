import java.util.Scanner;
public class Startpattern {


//___________________________Printing Star Pattern___________________________    
// * 
// * * 
// * * * 
// // * * * * 
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number of rows for the star pattern: ");
//     int n = sc.nextInt();
//     for(int i = 1; i <= n; i++) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }





//___________________________Printing Star Pattern___________________________
// * * * * *
// * * * *
// * * *
// * *
// *
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number of rows for the star pattern: ");
//     int n = sc.nextInt();
//     for(int i = n; i >= 1; i--) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }




//______________________Printing Star Pattern___________________________    
// 1 
// 1 2 
// 1 2 3
// 1 2 3 4 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows for the star pattern: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}

    














































































































}