import java.util.*;
public class Function_Methds {

    //----Function example

    // public static void Printmyname(String name){
    //     System.out.println(name);
    // }
    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next(); 

    // Printmyname(name);
    // }




    //-------Function for sum of 2 numbers

    // public static int PrintSum(int a, int b){
    //     int sum = a+b;   // sum variable for newfunction
    //     return sum;     // we alwaya need to return.
    // }
    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt(); 
    //     int b = sc.nextInt();
        
    // }

    //     //You can get output by this......... 

    //     //int sum = PrintSum(a,b);   // sum variale for main function
    //     //System.out.println(sum); 

    //     //Or by this.........

    //     System.out.println(PrintSum(a, b));
    // }



 //------Product of 2 numbs
        // public static int Product(int a, int b){
        //     int prod = a*b;
        //    // System.out.println(prod);
        //     return prod;
        // }
        

        // public static void main(String [] args){
        //     Scanner  sc = new Scanner(System.in);
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int pro = Product(a,b);
        //     System.out.println(pro);
        // }


 
 

//----------Factorial of a number
    
    // public static void Pfactorial(int n){
    //     //condition
    //     if(n<0){
    //         System.out.println("Invalid Number");
    //         return;
    //     }
    //     int factorial = 1;  // we give factorial = 1 so if multiplied with any number it changes to that number
    //     //loop
    //     for(int i = 1;i<=n; i++){  //i n se le kr 1 tk jaye means decending order but if we use__for(int i=1;i<=n; i++)__i 1 se le kr n tk jaye means acending order
    //       factorial = factorial * i;
    //     }

    //     System.out.println(factorial);
    
    // }

    //     public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();   
    //         Pfactorial(n);
    //     }
    // }
    



    
// //-----------------binormial function 
        
    // public static int Pfactorial(int n){
    
    //     int factorial = 1;  
    //     for(int i = 1;i<=n; i++){ 
    //       factorial = factorial * i;
    //     }
    //     return factorial;
    // }
    // public static int binomial_fun(int n,int r){
    //     int n_fac = Pfactorial(n);
    //     int r_fac = Pfactorial(r);
    //     int nmr_fac = Pfactorial(n-r);

    //     int binomial = n_fac/(r_fac*nmr_fac);
    //     return binomial;
    // }
    //     public static void main(String[]args){
    //     System.out.println(binomial_fun(5, 2));
    //     }
    // }




//-------Prime Number

//     public static boolean isPrime(int n) {
//         boolean isPrime = true;
//         for(int i = 2;i<=n-1;i++){
//             if(n%i==0){
//                isPrime = false;
//                break; 
//             }
//         }
//         return isPrime;  //return true;
//     }
 
//     public static void main(String[] args) {
        
//         System.out.println(isPrime(20));
//     }
// }








//---------------Prime Number in range....To run this code uncomment the isPrime funtion code.
 
// public static void Primesinrange(int n) {
//         //boolean isPrime = true;
//         for(int i=2; i<=n; i++){
//             if(isPrime (i)){
//                System.out.print(i+" ");
//         }
//     } 
//     } 
    
 
//     public static void main(String [] args) {
//         Primesinrange(20);
//     }
// }









// //--------------Binary to decimal

// public static void binTodec(int binNum) {

//     int Mynum = binNum;
//     int pow = 0;
//     int decNum = 0;

//     while (binNum>0) {
//         int lastdigit = binNum % 10;
//          decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
//          pow++ ;
//          binNum = binNum/10;
//     }
//     System.out.println("the decimal num of " + Mynum + " is " + decNum );
// }
// public static void main(String[] args) {
//     binTodec(11);
// }
// }











//--------------Decimal to binary 


// public static void decTobin(int decNum) {

//     int Mynum = decNum;
//     int pow = 0;
//     int binNum = 0;

//     while (decNum>0) {
//         int rem = decNum % 2;
//          binNum = binNum + (rem * (int)Math.pow(10, pow));
//          pow++ ;
//          decNum = decNum/2;
//     }
//     System.out.println("the binary num of " + Mynum + " is " + binNum );
// }
// public static void main(String[] args) {
//     decTobin(11);
// }
// }












 

       

