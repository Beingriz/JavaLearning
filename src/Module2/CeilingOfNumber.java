package Module2;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {-18, -10, 0, 1,2, 5, 15, 48, 78, };
        int target = 79;
        System.out.println(cieling(arr, target));
    }

    static int cieling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid+1;
            }
            else if (target < arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
            if (target > arr[arr.length-1]){
                return -1;
            }
        }
        // the next Greater Element and Smallest of that rnage is where start points when target is not found
        // this is Ceiling of Number

        return start;
    }
}
