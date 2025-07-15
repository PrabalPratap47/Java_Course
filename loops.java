//package Java_Course;
// import java.util.Scanner;

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int even = 0;
//         int choice;
//         int odd = 0;

//         do{ 
//             System.out.print("input :-" + " ");
//             int n = sc.nextInt();
//             if (n % 2 == 0) {
//                 even += n;
//             }
//             else{
//                 odd += n;
//             }
//             System.out.print("press 1 to continue :-" + " ");
//             choice = sc.nextInt();
//         }while(choice ==1);
//         System.out.println("even sum :-"+ even);
//         System.out.println("odd sum :-" + odd);

//     }
//     }
    





//------------------print table of n
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1;i<=10;i++){
            int ans = n * i;
            System.out.println(ans);         
        }
    }
}




// //------Factorial
// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fac = 1 ;
//         for(int i =1;i<=n;i++){
//           fac = fac * i;
          
//         }
//         System.out.println(fac);
//     }
// }