import java.util.*;
public class Strings {

    //---------------------->input and output
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Give your input-:");
//         String str = sc.nextLine();
//         System.out.println( "You input is -: "+str);

//     }
// }    






    //---------------->Lenght of string

    // public static void main(String[] args) {
    //     String str = "Prabal Pratap";
    //     System.out.println(str.length());
    // }






    //--------------------->Concatination

    // public static void main(String[] args) {
    //     String startname = "Prabal";
    //     String endname = "Pratap";
    //     String fullname = startname + " " + endname;
    //     System.out.println(fullname);
    // }









    //------------------------------>String CharAt method to print a paticular element

    // public static void main(String[] args) {
    //     String str = "Prabal Pratap";
    //     System.out.println(str.charAt(3));
    // }




    //------------------------------->String CharAt method to print all elements


//     public static void Char(String fullname){        //char function
//         for(int i =0;i<fullname.length();i++){
//             System.out.print(fullname.charAt(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         String fullname = "Prabal Pratap Singh";
//         Char(fullname);
//     }
// }










    //---------------------------------->Palindrome in a string<----------------------------



//     public static boolean palindrome(String str){
//     int n = str.length();
//     for(int i =0;i<str.length()/2;i++){
//         if(str.charAt(i) != str.charAt(n-1-i)){
//             return false;
//         }
//     }
//     return true;
// }

//     public static void main(String[] args) {
//         String str = "nqoaqn";
//         System.out.println(palindrome(str));  
//     }
// }










//------------------------------------>Direction question<-------------------------------------

// public static float shortestPath(String path){  //Flot is taken as our output will be in in decimal or we can take double too

//     int x=0,y=0;
//     for(int i =0;i<path.length();i++){
//         char dir = path.charAt(i);

//         if(dir == 'E'){
//             x++;
//         }
//         else if (dir == 'W'){
//             x--;
//         }
//         else if(dir == 'N'){
//             y++;
//         }
//         else {
//             y--;
//         }    
//     }
//         int X2 = x*x;                         //as (x-0)^2 is equal to x^2 
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2+Y2);   //Type casting to float
// }

// public static void main(String[] args) {
//     String path = "WNEENESENNN";
//     System.out.println("Total lenght = "+shortestPath(path));
// }
// }











//---------------------------->SubString<---------------------------------------


// // public static String substring(String str, int si, int ei){
// //     String strng = "";
// //     for(int i = si;i<ei;i++){
// //         strng +=  str.charAt(i);
// //     }
// //     return strng;
// // }

// public static void main(String []args){
//     String str = "Hello";

//     System.out.println(str.substring (0,5));

//     //System.out.println(substring(str, 0, 5));
// }
// }








//-------------------------------->comparison of Strings<------------------------------------------


// public static void main(String[] args) {
    
//     String fruits[] ={"apple","Banana","Mango","Peach"}; 
//     String Largest = fruits[0]; //we are putting fruits[0] ie; "apple" in string naming largest
    
//     for(int i=0;i<fruits.length;i++){
//     if(Largest.compareToIgnoreCase(fruits[i])<0){  //The condition (< 0) checks specifically If Largest is lexicographically smaller than fruits[i].
//                                                         //if we use compareTO function then it won't be compatible with capital letters
//         Largest = fruits[i];     //if largest is smaller then it is changed with current element
//     }
//     }
//     System.out.println(Largest); 
// }
// }






//------------->to String function

// public static void main(String[] args) {
    

//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     String s = Integer.toString(n);
//     System.out.println(s);
//     }
//     }

    





//--------------------------->String to uppercase<---------------------------------------
 

// public static String touppercase(String str){
//     StringBuilder sb = new StringBuilder(" ");

//     char ch = Character.toUpperCase(str.charAt(0));
//     sb.append(ch);

//     for(int i =1;i<str.length();i++){
//         if(str.charAt(i) == ' ' && i<str.length()-1){
//             sb.append(str.charAt(i)); // space is added
//             i++;

//             sb.append(Character.toUpperCase(str.charAt(i)));
//         }
//         else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();

// }
// public static void main(String[] args) {
//     String str = "hi i am prabal.";
//     System.out.println(touppercase(str));
// }
// }







//----------------------------------->String Compression<-----------------------------


// public static String compress(String str){
//     String str2=" ";
//     for(int i=0;i<str.length();i++){
//         Integer count =1;
//         while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//             count++;
//             i++;
//         }
//         str2 += str.charAt(i); // this will add letters always

//         if(count >1){
//             str2 = str2 + count.toString(); //this will add number else it will dont do anything
//         }
// }
// return str2;
// }
// public static void main(String[] args) {
//     String str = "aaaabbbbbbbcc";
//     System.out.println(compress(str));
// }
// }












//----------------------->Questions of String


// //count no of vowels
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Give your String");
//     String str = sc.nextLine();

//     int count=0;
//     for(int i=0;i<str.length();i++){
//         char ch = str.charAt(i);
//         if(ch =='a' || ch=='e'||ch=='i'||ch =='o' || ch=='u'){
//             count++;
//         }
//     }
//     System.out.println("No of vowels = "+count);
// }




//-------------------->Anagrams Check


//     public static void main(String[] args) {
//         String str1 = "earth";
//         String str2 = "heart";

//         // Convert Strings to lowercase, so that we don't have to check for uppercase separately
//         str1 = str1.toLowerCase();
//         str2 = str2.toLowerCase();

//         // First check if the lengths are the same
//         if (str1.length() == str2.length()) {

//         // Convert strings into char arrays
//             char[] str1charArray = str1.toCharArray();
//             char[] str2charArray = str2.toCharArray();

//         // Sort the char arrays
//             Arrays.sort(str1charArray);
//             Arrays.sort(str2charArray);

//         // If the sorted char arrays are identical, the strings are anagrams
//             if (Arrays.equals(str1charArray, str2charArray)) {
//                 System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
//             } else {
//                 System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//             }
            
//         } else {
//             // Case when lengths are not equal
//             System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
//         }
//     }
// }