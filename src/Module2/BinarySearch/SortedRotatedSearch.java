package Module2.BinarySearch;
// This is Based on Take U Forward Approad.
/* 	1. Sorted Rotated Array with Distinct Elemet.
		a. Take U Forward Approach Steps.
			1. Find Mid and Check if mid is Target. Then return
			2. If not Check the left half is sorted
			3. If yes check if target is in the range. If yes ignore the righ side and make end = mid-1
			4. If Not ignore the left side and bring start at mid+1
			5. If Left is not sorted then repeat the same with right sorted Part
     If no target found return -1. */

public class SortedRotatedSearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        int target = 3; // O:P -1
//        int target = 0; // O:P -1
        int target = 1; // O:P 5
        System.out.println(binraySearch(arr, target));
    }
    static int binraySearch(int[] arr, int target){
        int start  =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) /2;

            if(arr[mid] == target) return mid;

            // Check if left is sorted?
            if(arr[start] <= arr[mid]){
                /* 1. it sorted.
                    2. now check if target is int the range
                 */
                if(target >= arr[start] && target <= arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            // Right is Sorter
            else {
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
