package Module2.BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {-18, -10, 0, 1,2, 5, 15, 48, 78, };
        int target = 6;
        System.out.println(floorNumber(arr, target));
    }

    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid+1;
            }
            if (target < arr[mid]){
                end = mid-1;
            }
            if(target == arr[mid]){
                return mid;
            }
        }
        // the bigger element smaller than
        // this is Ceiling of Number

        return end;
    }
}
