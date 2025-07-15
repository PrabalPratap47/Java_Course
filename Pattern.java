
public class Pattern {
    public static void main(String[]args){

        //Solid Rectangle
    //     for(int i =1;i<=4;i++){
    //         for(int j=1;j<=5;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
      


    //Hollow Reactangle
    // int n = 4;
    // int m = 5;

    //     //outer loop -> for rows

    //     for(int i=1; i<=n; i++){

    //         //inner loop -> for columns

    //         for(int j = 1; j<=m; j++){
    //             //cell (i,j)
    //             if(i == 1 || j == 1 || i == n || j == m){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }




    // Half Pyramid    //Row number = Total columns
    // int n=4;                  //n is number of lines
    // for(int i=1;i<=n;i++){    //here i is row number
    //     for(int j=1;j<=i;j++){     //here i is upper limit
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }




    //Inverted Half-Pyramid     

    for(int i=4; i>=1; i--){     
       for(int j=1; j<=i; j++){     
            System.out.print("*");
        }
        System.out.println();
    } 




    //Half-pyramid 180
    //outer loop
    // int n=4;
    // for(int i=1; i<=n; i++){

    //     //inner loop -> Space print
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }

    //     //inner loop ->star print
    //     for(int j=1;j<=i;j++ ){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    //half pyramid with numbers
    // int n=6;
    // for(int i=1;i<=n;i++){    //here i is row number
    //     for(int j=1;j<=i;j++){     //here i is upper limit
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();

    // }


    //inverted half pyramid with numbers
    // int n =5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    


    // Floyd's Half Triangle
    // int n =5;
    // int num = 1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(num+" ");
    //         num++;
    //     }
    //     System.out.println();
    // }


    //0-1 Triangle
    // int n =5;
    // for(int i=1;i<=n;i++){
    //     //inner loop
    //     for(int j=1;j<=i;j++){
    //         int sum = i+j;
    //         if(sum % 2 == 0){ //even
    //             System.out.print("1 ");
    //         }
    //         else{ //odd
    //             System.out.print("0 ");
    //         }
         
    //     }
    //     System.out.println();
    // }

}
}
