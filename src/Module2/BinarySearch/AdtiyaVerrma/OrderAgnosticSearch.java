package Module2.BinarySearch.AdtiyaVerrma;

import java.util.Scanner;

public class OrderAgnosticSearch {
    public static void main(String[] args) {


        int[] arr = {20,17,16,15,14,13,2,1};
//        int[] arr = {1,2,3,4,5,6,7,8,9};

        int target =20;
        if(arr[0] < arr[arr.length-1]){
            System.out.println(ascBS(arr, target));
        }else if(arr[0] > arr[arr.length-1]){
            System.out.println(desBS(arr, target));
        }
    }
    static int ascBS(int[] arr, int target){
        int start  =0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]) return mid;
            if (target > arr[mid]) {
                start  = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    static int desBS(int[] arr, int target){
        int start  = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]) return mid;
            if (target < arr[mid]) {
                start = mid+1;
            }else {
                end  = mid-1;
            }
        }
        return -1;
    }
}
