package Module2.BinarySearch.AdtiyaVerrma;

public class CountOfElement {
    // Find the No of Rotations in Sorted Array
    /*
    1. to get the no of time the array is rotated
        Find the pivot Element in an array and return pivot+1
    2. Find Prev and Next of Mid and Compare with bothi mid is smaller retrun mid
        else
        check if left is sorted then check in right
        if right is soted then check in lef.
        // Idea : the index of minimum element in the array will actual value for no of array rotatins.
    * */
    public static void main(String[] args) {
        int[] arr = {5,8,9,10,12,14,15,2,3,4};
        System.out.println(findPivot(arr)+1);
        System.out.println(findRotation(arr));
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int findRotation(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            int prev = ((mid+ arr.length -1) % arr.length);
            int next = ((mid+1) % arr.length);
            if(arr[mid] <= prev && arr[mid] <= next){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

}
