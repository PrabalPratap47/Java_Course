import java.util.*;
public class Arrays {

//------------->Simple input output

//     public static void main(String args[]){
//         int marks[]=new int[3];
//         marks[0]=92;
//         marks[1]=32;
//         marks[2]=42;
//        // System.out.println(marks[2]); //if we simply run by giving marks as in output this there would not be any output and there would only be a garbage value 
//         for(int i =0;i<3;i++){
//             System.out.println(marks[i]);
//         }
//     }   
// }





//---------------->Another way of input

//     public static void main(String args[]){
//         int marks[]={1,2,3,4};
//        // System.out.println(marks[2]); //if we simply run by giving marks as in output this there would not be any output and there would only be a garbage value 
//         for(int i =0;i<4;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }






//-------------Take an array as input 


//     public static void main(String args[]){
//     //Input Size
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[]= new int[size];

//     //Input value
//         for(int i = 0;i<size;i++){
//              numbers[i]=sc.nextInt();
//         }
    
//     //Output
//         for(int i =0;i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         } 
//     }
// }







//-------------Simple input output


//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int size = sc.nextInt();
//       String names[] = new String[size];


//       //input
//       for(int i=0; i<size; i++) {
//           names[i] = sc.next();
//       }
     
//       //output
//        for(int i=0; i<names.length; i++) {    //instead of names.length we can use size keyword

//            System.out.println("name " + (i+1) +" is : " + names[i]); //we gave i+1 as array starts index from zero and we want it from 1
//            //System.out.println(names[i]);
//         }
//     }
// }





//-------------Take an array as input and seach for given number x and print index at which it occurs.


//     public static void main(String args[]){

//     //Input Size
//         System.out.println("enter your array size");
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[]= new int[size];

//     //Input
//         System.out.println("enter your array");
//         for(int i = 0;i<size;i++){
//              numbers[i]=sc.nextInt();  //i is index here and numbers are getting entered to respective indexes.
//         }
//      // get your x   
//         System.out.println("enter your x");
//         int x = sc.nextInt();
    
//     //Output
//         for(int i =0;i<numbers.length;i++){
//             if(numbers[i] == x){
//                 System.out.println("x is found at index " + i);
//             }
//         } 
//       }

// }












//-----------------------Array function to update


// public static void updated(int marks[]){
//     //updation
//     for(int i=0; i<marks.length;i++){
//         marks[i] = marks[i]+1;
//     }
//     //output
//     for(int i=0;i<marks.length;i++){
//         System.out.print(marks[i]+" ");
//     }
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your array size");
//     int size = sc.nextInt();
//     int marks[] = new int[size];
    
//     //input array
//     System.out.println("Enter your array");
//     for(int i=0; i<marks.length;i++){
//         marks[i] = sc.nextInt();
//     }
//     updated(marks);

// }
// }









//------------------->Binary Search 


// public static int binary(int numbers[],int key){
//     int start = 0;
//     int end = numbers.length-1;
//     while(start<=end) {
//         int mid = (start+end) / 2; 

//         //Comparisons
//         if(numbers[mid] == key){
//             return mid;
//         }
//         else if(numbers[mid] < key){   //2nd Half ,Right
//             start = mid+1;
//         }
//         else{                         //first half ,Left  
//             end = mid-1;
//         }
//     } 
//     return -1;
// }

// public static void main(String[] args) {
//     int numbers[]={1,2,3,4,6,7,9}; //Array should be sorted order
//     int key =9;

//     System.out.println("Index of key is " + binary(numbers,key));
// }
// }












//-----------_________To Linear search the paticular x.


// public static int Search(int marks[],int key) {
//    for(int i=0;i<marks.length;i++){
//        if(marks[i] == key){
//            return i;    
//        }
//    }
//    return 1;
// }

// public static void main(String[] args) {
//    int marks[]={1,2,3,4,5,6,7,8,9};    
//    int key = 40;

//    int index = Search(marks, key);  //as search function will return index, so we stored it in index variable
//    if(index == 1){
//        System.out.println("Index not found");    
//    }
//    else{
//        System.out.println("Index is " + index);    
//    }
// }
// }








//______________________To find largest and smallest number in an array


// public static int getlargest(int numbers[]){
//     int largest = Integer.MIN_VALUE;    // Negative Infinity        
//     int smallest = Integer.MAX_VALUE;   //Positive Infinity
//     for(int i =0;i<numbers.length;i++){
//         if(largest<numbers[i]){
//             largest=numbers[i];    
//         }
//         if(smallest>numbers[i]){
//             smallest=numbers[i];    
//         }
//     }
//     System.out.println("smallest is "+ smallest);
//     return largest;
// }

// public static void main(String[] args) {
//     int numbers[] = {1,2,3,4,6,9};    
//     System.out.println("largest is "+getlargest(numbers));
// }
    
// }


















//------------------->Reverse an array


// public static void reverse(int array[]){
//     int first =0;
//     int last = (array.length)-1;
//     while (first<last) {
//         int temp = array[last];       //temp variable is defined
//         array[last] = array[first];
//         array[first] = temp;

//         first ++;     //to increment first index
//         last--;        //to decrement last index 
//     }  
// }

// public static void main(String[]args){
//    int array[]={1,2,3,9,2,90,5,6};

//     reverse(array);

//     //print
//     for(int i = 0;i<array.length;i++){
//           System.out.print( array[i] +" ");
//     }
//     System.out.println();
// }
// }







// //--------------------->Reverse an array 1st approach


// public static void main (String args[]){
//     int array[]={0,1,2,3,4,5,6,8};
//     int result[] = new int[array.length];
   
//     // Reverse the array
//     for (int i = 0; i < array.length; i++) {
//         result[i] = array[array.length - 1 - i]; //-i is imp becoz it reduces the index from back of array else it will always give 8-1 = 7, 8 is array length and further explanation --->When i = 0, array.length - 1 - i equals the last index of the array (e.g., 7 for an array of length 8).When i = 1, array.length - 1 - i equals the second-to-last index (e.g., 6).
//     }

//     //print
//     for(int m = 0;m<result.length;m++){
//         System.out.print( result[m] +" ");
// }
// }
// }










//------------------------->Pairs in array


// public static void pairs(int array[]){
//     int tp =0;                           //it prints total number of pairs

//     for(int i=0;i<array.length;i++){ 
//         int curr = array[i];                 //Here curr is used to denote the current element
//         for(int j=i+1;j<array.length;j++){
//             System.out.print( "(" + curr /*curr */ + "," + array[j] + ")" );
//             tp++;       //increments tp after every pair.
//         }
//         System.out.println( );
//     }
//     System.out.println("Number of pairs are :"+tp);
    
// }
// public static void main(String[]args){
//    int array[]={1,2,3,4,5,6 };

//    pairs(array);
// }
// }



//In summary, curr is used to store the current element for pairing, 
// while start is used to mark the starting index of the subarray. 
// The difference in assignment is due to the different purposes 
// of the variables in the two methods.










//-------------------------->Print subarrays

// public static void subarrays(int array[]){
//     int ts=0;                                  //Gives total subarray count

//     for(int i=0;i<array.length;i++){
//         int start=i;                        // Here start is used to store the starting index)
//         for(int j=i;j<array.length;j++){   //j=i or 0 not i+1 coz single element is also a subarray.
//             int end=j;

//             //System.out.println(array[i]+" "+array[j]);
//             for(int k=start;k<=end;k++){     //to print subarrays
//                 System.out.print(array[k]+" ");
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("Total Subarrays are : "+ts);
//     }

// public static void main(String[] args) {
//     int array[]={2,4,6,8,10};
//     subarrays(array);
// }
// }








//________________________Print Max sum of subarrays--Brute force approach



//public static void subarrays(int array[]){

//     int maxsum=Integer.MIN_VALUE;       //If you use maxsum = Integer.MIN_VALUE: You are allowing any value, even negative, to be stored.                           //Gives total subarray count
//     int sum=0;
//     for(int i=0;i<array.length;i++){
//     for(int j=i;j<array.length;j++){
//         for(int k=i;k<=j;k++){
//             sum+=array[k];
//         }
//         maxsum=Math.max(maxsum,sum);
//         sum=0; //to reset sum to 0
//         }
//     }    
//     System.out.println("Max sum is :"+maxsum);  
//     }

// public static void main(String[] args) {
//     //int array[]={2,4,6,8,10};
//     //int array[]={-2,3,-2,-1};
//     int array[]={3,-3};
//     subarrays(array);
// }
// }





//________________________Print sum of max subarrays--Prefix sum approach


// public static void Maxsubarrays(int array[]){

//     int maxSum = Integer.MIN_VALUE;  // Negative Infinity
//     int currSum =0;

//     int prefix[]=new int[array.length]; //intiating prefix array
//     prefix[0]=array[0];                 //as we can't do prefix[i-1] when i is 0 so we aready assined our array[0] = prefix[0] 

//     // To find prefix array first
//     for(int i=1;i<prefix.length;i++){   
//         prefix[i] = prefix[i-1] + array[i];
//     }

//     // to find start and end
//     for(int i=0;i<array.length;i++){
//         int start=i;
//         for(int j=i;j<array.length;j++){   //j=i or 0 not i+1 coz single element is also a subarray.
//             int end=j;
            
//         // adding prefix array
//             currSum=0;
//             currSum = start == 0 ? prefix[j] : prefix[j] - prefix[start-1 ]; //if our prefix[start]=0 then we only take prefix[end] and don't need to minus 1 from prefix[start]
//         //To find max sum
//             if( currSum>maxSum){
//             maxSum = currSum;
//             }
//         }
//     }
//     System.out.println("Maximun Sum is :"+ maxSum);
// }

// public static void main(String[] args) {
//     int array[]={2,4,6,8,10};
//     Maxsubarrays(array);
// }
// }





//________________________Print sum of max subarrays--Kadane's Algorithm

// public static void Maxsubarrays(int array[]){
//     int maxSum = Integer.MIN_VALUE;  // Negative Infinity
//     int currSum =0;
//     for(int i=0;i<array.length;i++){
//         currSum+=array[i];

//         if(currSum<0){ //Kadens algo says -:whenever currsum reaches negative it becomes 0
//             currSum=0;
//         }
//         maxSum=Math.max(maxSum,currSum);

//     }
//     System.out.println("Maximun Sum is :"+ maxSum);
// }
//     public static void main(String[] args) {
//         int array[]={-3,3};
//         Maxsubarrays(array);
//     }
// }












//----------------->Rainwater Trapping problem


// public static int trapped(int array[]){

//     int n = array.length; //for easy access

//     //Calculate Left max boundary - array
//     int leftmax[] = new int[n]; 
//     leftmax[0]=array[0];
//     for(int i=1;i<n;i++){
//         leftmax[i]=Math.max(array[i],leftmax[i-1]); //compare current index with previous one
//      }

//     //Calculate Right max boundary - array
//     int rightmax[]=new int[n];
//     rightmax[n-1]=array[n-1]; //As we start from right end of array
//     for(int i=n-2;i>=0;i--){  // i=n-2 as we have already for n-1 
//         rightmax[i]=Math.max(array[i], rightmax[i+1]); // i+1 is used as we compare current index with next one and next one is +1 element from left to right
//     }



//     //loop
//     int trappedWater = 0 ;
//     for(int i =0;i<n;i++){ 
//         int waterlevel = Math.min(leftmax[i], rightmax[i]);
//         trappedWater += waterlevel - array[i];
//     }   
//     return trappedWater;
// } 
// public static void main(String[] args) {
//     int array[]={4,2,0,6,3,2,5};
//     System.out.println(trapped(array));
// }
// }










 

//----------------->Buy and sell stocks


public static int BuyAndSellStocks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;   //+infity
    int maxProfit = 0;


    for(int i =0;i<prices.length;i++){
        if(buyPrice < prices[i]){ //profit
            int profit = prices[i]-buyPrice; //Today's Profit

            maxProfit = Math.max(maxProfit,profit); //overall max profit
        }

        else{                       //if  buy price is more we assign current price means prices to it .
            buyPrice=prices[i];   
        }
    }
    return maxProfit;

}
public static void main(String[] args) {
    int prices[]={7,1,5,3,6,4};
    System.out.println(BuyAndSellStocks(prices));
}
}