public class BtArray {
//     public static void print(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }


//     public static void Changearray(int arr[],int i,int val){  // i is index and val is value as we are using recursion for putting element in array we use these
        
//         //base case
//         if(i==arr.length){
//             print(arr);     //prints the correct array when we reach the top most element 
//             return;
//         }


//         //recursion
//         arr[i]=val;
//         Changearray(arr, i+1, val+1);

//         arr[i]=arr[i]-2;    //this line works only after base case is done so it reduces each element after the element is fitted in array

//     }
//     public static void main(String[] args) {
//         int[] arr = new int[5];
//         Changearray(arr, 0, 1);
//         print(arr);        //prints the array which has i-2 

//     }
    
// }






//     public static void findsubsets(String str, String ans, int i){
//         //base case
//         if(i==str.length()){
//             if(ans.length()==0){
//                 System.out.println("Empty");
//             }
//             else{
//                 System.out.println(ans);
//                 }
//             }
//         //Yes choice
//         findsubsets(str, ans+str.charAt(i), i+1);
//          //Yes choice
//          findsubsets(str, ans, i+1);
//     }
//     public static void main(String[] args) {
//         String str ="abc";
//         findsubsets(str, "", 0);
//     }
// }





