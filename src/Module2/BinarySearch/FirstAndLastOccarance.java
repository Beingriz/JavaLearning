package Module2.BinarySearch;

import java.util.Scanner;

public class FirstAndLastOccarance {
    public static void main(String[] args) {
        int arr[] = {5,7,7,7,8,8,8,8,9,9,9,10};
        int target = 8;
        int res[]= {-1,-1};
        res[0]  = search(arr,target,true);
        if(res[0]!=-1){
            res[1]= search(arr,target,false);
        }

        System.out.println(res[0] + " "+ res[1]);
    }
    static  int search(int[] arr, int target, boolean first){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start  = mid+1;
            }else {
                ans = mid;
                if (first){

                    end= mid-1;
                }else {

                    start  = mid+1;
                }
            }
        }
        return ans;
    }
}
