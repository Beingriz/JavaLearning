package Module2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -10, 0, 1,2, 5, 15, 48, 78, };
        int target = 15;
        System.out.println(binarySeach(arr, target));
    }

    static int binarySeach(int[] arr, int target){
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
        return -1;
    }
}
