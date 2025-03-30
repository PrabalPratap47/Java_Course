
public static void insertion(int arr[]){
    int n = arr.length ;
    for(int i =0; i<n; i++){

        int curr = arr[i];
        int prev = i-1;

        //finding out the corrct position to insert , pushing back
        while(prev>=0 && arr[prev] > arr[curr]){
            arr[prev+1]=arr[prev];    //shifting of small element
            prev--;                          
        }

        //insertion
        arr[prev+1] = arr[curr];
    }

    //print output
    for(int k=0;k<n;k++){
        System.out.print(arr[k]+" ");
    }
}
