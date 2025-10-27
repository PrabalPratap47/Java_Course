//import java.lang.reflect.Array;
import java.util.*;
public class Sorting{


    //----------------->Bubble sort<---------




//     public static void BubbleSort(int array[]){
//         int swap=0;
//         for(int turn=0;turn<array.length;turn++){  //outer loop for turns
//             for(int j=0;j<array.length-1;j++){
//                 if(array[j]>array[j+1]){
//                     int temp = array[j];
//                     array[j]=array[j+1];
//                     array [j+1]=temp;
//                 }
//                 swap++;   
//             }      
//         }
//                 //to print

//                 for(int i=0;i<array.length;i++){
//                 System.out.print(array[i]+" ");
//                 }
//             System.out.println();
//             System.out.println("Number of swaps = "+swap);
//     }
//     public static void main(String[] args) {
//         int array[]={5,4,1,3,2};

//         BubbleSort(array);
        
//     }
// }









//------------------->Selection sort<--------------- 




//https://youtube.com/shorts/HRwi5gwlB0U?si=ZsX3wGACsnrvKbiF

// public static void selection(int arr[]){
//     int n = arr.length ;
//     for(int i =0; i<n-1; i++){

//         int minpos = i;

//         for(int j=i+1; j<n; j++){
//             if(arr[j]<arr[minpos]){
//                 minpos = j;   //stores the position (index) of the smallest element found so far
//             }
//         }

//         //swap , we dont swap in inner loop as if we did so it will work same as bubble sort
//         int temp = arr[minpos];
//         arr[minpos] = arr[i];
//         arr[i] = temp;
//     }

//     //print output
//     for(int k=0;k<n;k++){
//         System.out.print(arr[k]+" ");
//     }
// }

// public static void main(String[] args) {
//     int arr[]={5,4,1,3,2};    
//     selection(arr);
// }
// }








//------------------>Insertion sort<------------------



//https://youtu.be/rrfRRllt4c4?si=nMBnt_kyAnMnQYTd 

// public static void insertion(int arr[]){
//     int n = arr.length ;
//     for(int i =0; i<n; i++){

//         int key = arr[i];
//         int j = i-1;

//         //finding out the corrct position to insert , pushing back
//         while(j>=0 && arr[j] > arr[key]){
//             arr[j+1]=arr[j];    //shifting larger element to the right
//             j--;                          
//         }

//         //insertion
//         arr[j+1] = arr[key];
//     }

//     //print output
//     for(int k=0;k<n;k++){
//         System.out.print(arr[k]+" ");
//     }
// }

// public static void main(String[] args) {
//     int arr[]={5,4,1,3,2};    
//     insertion(arr);
// }
// }











//------------------------>Counting Sort<-------------------

// public static void Counting(int arr[]){
//     int n = arr.length;

//     //find largest
//     int largest=Integer.MIN_VALUE;
//     for(int i =0; i<n; i++){
//         largest=Math.max(largest, arr[i]);    // OR  if(arr[i] > largest)   largest = arr[i]; 

//     }

//     //Frequency Counting
//     int count[]=new int[largest+1];
//     for(int i=0;i<n;i++){
//         count[arr[i]]++; //Go to the index equal to the value of arr[i] in the count array and increment it by 1 Ex-: i = 0 → arr[i] = 4👉 count[arr[i]] means count[4] → count[4]++ → increases by 1 → count becomes [0, 0, 0, 0, 1]
//     }

//     //Sorting
//     int j =0;
//     for(int i=0;i<count.length;i++){
//         while (count[i]>0) {   //count[i] is frequency of element i 
//             arr[j]=i;          //and i is not only an index here but also the element of original array  
//             j++;
//             count[i]--;
//         }
//     }

//     //print output
//     for(int k=0;k<n;k++){
//         System.out.print(arr[k]+" ");
//     }
// }

// public static void main(String[] args) {
//     int arr[]={1,4,1,3,2,4,5,6,7};    
//     Counting(arr);
// }
// }

/* if code gives this error (Index 9 out of bounds for length 9) check code */







//----------------------->Merge Sort(divide and conquer)<-------------


//to print array
// public static void printarr(int arr[]) {
//     for (int i = 0; i <= arr.length - 1; i++) {
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
// }

// public static void mergesort(int arr[], int si, int ei) {
//     if (si >= ei) {
//         return;
//     }
//     // Main logic
//     int mid = si + (ei - si) / 2;
//     mergesort(arr, si, mid);
//     mergesort(arr, mid + 1, ei);
//     merge(arr, si, mid, ei);
// }

// // Merge method to merge the sorted parts
// public static void merge(int arr[], int si, int mid, int ei) {
//     int temp[] = new int[ei - si + 1]; // Temporary array/left(0,3)=4 and right(4,6)=3 => 6-0+1=7 it explains how size of temp is defined
//     int i = si; //indx for 1st sorted part
//     int j = mid+1;  //indx for 2nd sorted part
//     int k = 0;      //ind for temp
//     // Merge the two sorted parts
//     while (i <= mid && j <= ei) {
//         if (arr[i] <= arr[j]) {
//             temp[k++] = arr[i++];
//         } else {
//             temp[k++] = arr[j++];
//         }
//     }

//     // For leftover elements of the first sorted part
//     while (i <= mid) {
//         temp[k++] = arr[i++];
//     }

//     // For leftover elements of the second sorted part
//     while (j <= ei) {
//         temp[k++] = arr[j++];
//     }

//     // Copy temp array back to the original array
//     for (int p = 0; p < temp.length; p++) {
//         arr[si + p] = temp[p];
//     }
// }

// public static void main(String[] args) {
//     int arr[] = {6, 3, 9, -5, 2, 8};
//     int si = 0;
//     int ei = arr.length - 1;
//     mergesort(arr, si, ei);
//     printarr(arr); // Calling print function
// }
// }







//------------------->Binary Search tree

// public static int binary(int numbers[],int key){
//     int start = 0;
//     int end = numbers.length-1;
//     while(start<=end) {
//         int mid = (start+end) / 2; 

//         //Comparisons
//         if(numbers[mid] == key){
//             return mid;
//         }
//         else if(numbers[mid] < key){ //2nd Half ,Right
//             start = mid+1;
//         }
//         else{                     //first half ,Left  
//             end = mid-1;
//         }
//     } 
//     return -1;
// }








//------------------------>Quick Sort<-----


// public static void printarr(int arr[]){
//     for(int i = 0; i < arr.length; i++){
//         System.out.print(arr[i] + " ");
// }
// System.out.println();
    
// }

// public static void quicksort(int arr[],int si,int ei){

//     if(si>=ei){
//         return ;
//     }
//     //last element
//     int pidx = partition(arr,si,ei);
//     //dividing and calling
//     quicksort(arr, si, pidx-1);//left
//     quicksort(arr, pidx+1, ei);//right

    
// }
// //partition function
// public static int partition(int arr[],int si, int ei){
//     int pivot = arr[ei];
//     int i = si-1; //to make place for elements smaller than pivot
//     for(int j = si; j < ei; j++){
//         if(arr[j]<=pivot){
//             i++;
//             //swapping
//             int temp = arr[j];
//             arr[j] = arr[i];
//              arr[i] =  temp;
//         }
//         }
//         //swapping pivot with arr[i+1]
//         i++;
//             //swapping
//             int temp = pivot;
//             arr[ei] = arr[i];
//              arr[i] =  temp;
//         return i;
// }


// public static void main(String[] args) {
//     int arr[] = {6,3,9,8,2,5};
//     quicksort(arr,0,arr.length-1);
//     printarr(arr);

// }

// }







//--------------->Sorted , ROtated and accending order array

// public static int rotated(int arr[],int target,int si, int ei){
//     if(si>ei){
//         return -1;
//         }

//     int mid = si+(ei-si)/2;

//     //CASE 0
//     if(arr[mid]==target){
//         return mid;
//     }

//     //Case 1: // mid on L1
//     if(arr[si]<=arr[mid]){
//         //case a:
//         if(arr[si]<=target && arr[mid]>target){
//             return rotated(arr,target,si,mid-1);
//             }
//             //case b:
//             else {
//                 return rotated(arr,target,mid+1,ei);
//             }
//     }


//     //Case 2: mid on L2
//     else {
//         //case c
//         if(arr[mid]<=target && target<arr[ei]){
//             return rotated(arr,target,mid+1,ei);
//             }
//             //case d
//             else {
//                 return rotated(arr,target,si,mid-1);
//                 }
//     }
// }

// public static void main(String[] args) {
//     int arr[] = {4,5,6,7,0,1,2};
//     int target = 0;
//     int index = rotated(arr, target, 0, arr.length-1);
//     System.out.println(index);
// }

// }