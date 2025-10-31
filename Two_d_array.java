import java.util.*;
public class Two_d_array{



    //______________________How to find a element in 2-D array

//     public static boolean search(int matrix[][],int key){
//         int n=matrix.length,m = matrix[0].length; 
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("Key found at ("+i+","+j+")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not found");
//         return false;
//     }


//___________________________How to create a 2-D array

//     public static void main(String[]args){
//         int matrix [][]=new int[3][3];
//         int n=matrix.length,m = matrix.length; 

//         //__input
//         Scanner sc = new Scanner(System.in);
//          for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//     }

//     //__output
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             System.out.print(matrix[i][j]+" ");
//         }
//         System.out.println();
// }

//         //search(matrix,0 );  // calling search function
// }
// }





//____________________________________Sprial Matrix ---ImpQues------------------------------------------
   
// public static void spiral(int matrix[][]){
//     int startrow = 0;
//     int endrow = matrix.length-1;
//     int startcol = 0;
//     int endcol = matrix.length-1;
//     while(startrow<=endrow && startcol<=endcol){

//         // j is for variable coloumn and i is for variable row

//         //top 
//         for(int j=startcol;j<=endcol;j++){
//             System.out.print(matrix[startrow][j]+" ");
//         }
//         //Right
//         for(int i=startrow+1;i<=endrow;i++){  //we used startrow+1 to avoid duplicate printing of corner element
//             System.out.print(matrix[i][endcol]+" ");
//         }
//         //bottom
//         for(int j=endcol-1; j>=startcol;j--){  //we used endcol-1 to avoid duplicate printing of corner element
//             if(startrow==endrow){
//                 break;
//             }
//             System.out.print(matrix[endrow][j]+" ");
//         }
//         //left
//         for(int i=endrow-1;i>=startrow+1;i--){ //we used endrow-1 and startrow+1 to avoid duplicate printing of corner element
//             if(startcol==endcol){
//                 break;
//             }
//             System.out.print(matrix[i][startcol]+" ");
//         }

//         // above code gives outer boundary for inner boundary we incremeant values
//         startrow++;
//         startcol++;
//         endrow--;
//         endcol--;

//     }
//      //System.out.println();
// }

// public static void main(String[] args) {  
//     int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//     spiral(matrix);
// }

// }






//__________________________________Diagonal matrix --ImpQues-----------------------------------

// public static int Diagonal(int matrix[][]){

//     // //Brute force  O(n^2)
//     // int sum =0;
//     // for(int i =0;i<matrix.length;i++){
//     //     for(int j=0;j<matrix[0].length;j++){
//     //         if(i==j){
//     //             sum += matrix[i][j];
//     //         }
//     //         else if(i+j == matrix.length-1){
//     //             sum += matrix[i][j];
//     //         }
//     //     }
//     // }

//     //Best approach  O(n)
//     int sum =0;
//     for(int i =0;i<matrix.length;i++){ 
//         //primary Diagonal
//         sum += matrix[i][i];    // as for pd i=j so we used i*i
//         // Secondary Diagonal
//         if(i != matrix.length-i-1) // if i not equal to j for single element which remains in odd n
//         sum += matrix[i][matrix.length-i-1];   //as for sd i+j=n-1 equalsTo j = matrix.lenght-i-1
//     }

    
//     return sum;
// }
// public static void main(String[] args) {
//     int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
//     };
//     System.out.println(Diagonal(matrix));
// }
// }





//______________________________ Searching in sorted matrix

// public static boolean sorted(int matrix [][],int key){

//     int row=0,col=matrix[0].length-1;
//     while (row<matrix.length && col>=row) {

//         if(matrix[row][col]==key){
//             System.out.println("key is found at("+row+","+col+")");
//             return true;
//         }
//         else if(key<matrix[row][col]){  //if key is small move left 
//             col--;   // to move left
//         }  
//         else{     //if key > cell element move bottom
//             row++;  // move bottom
//         }
//     }
//     System.out.println("key not found");
//     return false;
// }
// public static void main(String[] args) {
//     int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//     int key = 11;
//     sorted(matrix, key);
// }
// }




//pdf questions
//Q-1
// public static void main(String[] args) {
//     int array [][]={{4,6,7},{8,8,7}};
//     int count =0;
//     for(int i =0;i<array.length;i++){
//         for(int j =0;j<array[0].length;j++){
//             if(array[i][j]==7){
//                 count++;
//             }
//         }
//     }
//     System.out.println(count);
// }
// }



// Q-2
// public static void main(String[] args) {
//     int array [][]={{1,4,9},{11,4,3},{2,2,3}};
//     int sum =0;
//     // for(int i = 1;i<2;i++){       //either this
//     //     for(int j=0;j<array[0].length;j++){
//     //         sum += array[i][j];
//     //     }
//     // }
//     for(int j=0;j<array[0].length;j++){   //Or this
//         sum += array[1][j];
//     }
//     System.out.println(sum);
// }
// }



//Q-3
// public static void main(String[] args) {
//         int array [][]={{1,2,3},{4,5,6}};
//         int row =2,col=3;

//         for(int i = 0;i<array.length;i++){       
//             for(int j=0;j<array[0].length;j++){
//                 System.out.print(array[i][j]+"  ");
//             }
//             System.out.println(" ");
//         }
 
//         int transpose [][] = new int [col][row];  // we did transpose here.
//         for(int i = 0;i<row;i++){       
//             for(int j=0;j<col;j++){
//                 transpose[j][i]=array[i][j];
//             }
//         }
//         System.out.println("  ");

//         for(int i = 0;i<transpose.length;i++){       
//             for(int j=0;j<transpose[0].length;j++){
//                 System.out.print(transpose[i][j]+"  ");
//             }
//             System.out.println(" ");
//         }
//     }
// }