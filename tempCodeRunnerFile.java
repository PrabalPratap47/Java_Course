
// public static void subarrays(int array[]){
//     int ts=0;                                  //Gives total subarray count

//     for(int i=0;i<array.length;i++){
//         int start=i;                        // Here start is used to store the starting index)
//         for(int j=i;j<array.length;j++){   //j=i or 0 not i+1 coz single element is also a subarray.
//             int end=j;
//             System.out.println("Subarray from index " + start + " to " + end);

//             //System.out.println(array[i]+" "+array[j]);
//             for(int k=start;k<=end;k++){           //to print subarrays
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
