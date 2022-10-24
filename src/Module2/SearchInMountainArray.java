package Module2;

public class SearchInMountainArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,3,1};
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        System.out.println(ans(arr, target));
    }
    // ans function to return the search element
    static int ans(int[] arr, int target){
        int start = 0;
        int peak = peakElementInArray(arr);
        int FirstHalf = orderAgnosticSerach(arr, target,start,peak);
        if(FirstHalf!=-1){
            return FirstHalf;
        }
        return orderAgnosticSerach(arr, target,peak+1, arr.length-1);
    }
    // peak function to find the peak in a given array
    static  int peakElementInArray(int[] arr){
        int low = 0;
        int high  = arr.length;

        while (low < high){
            int mid = low + (high-low)/2;

            if(arr[mid] > arr[mid+1]){
                high = mid;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
//    orderAgnostic is to apply bindary search either in the left sorter part or right sorted part
    static int orderAgnosticSerach(int[] arr, int target, int start, int end){
        int result = -1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                end = mid-1;
            } else if (target < arr[mid]) {
                start = mid+1;
            }else {
                result = mid;
                if(isAsc){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return result;

    }
}
