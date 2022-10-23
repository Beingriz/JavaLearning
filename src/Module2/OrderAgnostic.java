package Module2;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,5,8,9};
        int target  =8;
        System.out.println(orgerAgnosticBS(arr,target));
    }
    static int orgerAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            boolean isAsc = arr[start] < arr[end]; // boolean varaible gives the array is in ascending order or descending order

            int mid = start + (end - start) /2;

            if(arr[mid] ==  target){
                return mid;
            }
            if(isAsc){ // if it is in asc
                if(target > arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else{ // for descending
                if(target < arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
