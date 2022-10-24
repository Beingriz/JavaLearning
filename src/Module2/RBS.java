package Module2;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.println(search(arr,target));

    }
    static  int search(int[] arr,int target){
        int pivot = findPivotElemnt(arr);
        if(pivot == -1){
            return binarySeach(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target)
            return pivot;
        if(target >= arr[0]){
            return binarySeach(arr,target,0,pivot-1);
        }
        return  binarySeach(arr, target,pivot+1, arr.length-1);
    }
    static int binarySeach(int[] arr, int target, int start, int end){

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

    static int findPivotElemnt(int[] arr){
        int start  = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            /* check if the mid is greater than mid+1 then return mid   */
            if (arr[mid] > arr[mid + 1])
                return mid;
            if (arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
