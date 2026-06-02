package SearchingAndSorting;

import java.util.Collections;


import java.util.Arrays;

public class inBuildSort {
    public static void main(String[] args) {
        Integer arr[]= {2,1,3,21,12,34,43,33,45,41,43,23};
         Arrays.sort(arr,Collections.reverseOrder());   // not work on basic int

        // Arrays.sort(arr);    //sort complete arry
        // Arrays.sort(arr,0,5);  // sort some part of array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}




//O(nlogn)