package Module2.BinarySearch.AdtiyaVerrma;

public class OrderAgnosticSearch2 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {20,17,16,15,14,13,12,1};
        int target = 12;
        System.out.println(orderAgnosticBS(arr, target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        boolean sorted = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }else{
                if(sorted){
                    if(target > arr[mid]){
                        start = mid+1;
                    }else {
                        end = mid-1;
                    }
                }else{
                    if(target < arr[mid]){
                        start = mid+1;
                    }else {
                        end = mid-1;
                    }
                }
            }
        }
        return  result;
    }
}
