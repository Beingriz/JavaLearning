package Module2.BinarySearch;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140};
        int target = 80;
        System.out.println(ans(arr,target));
    }
    static  int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
         // finding range by double the size of window each time target is greater than end
        while (target > arr[end]){
            int temp = end + 1;
            end  = end+ (end-start)*2;
            start = temp;
        }
        return search(arr, target,start,end);
    }
    // method of binary search
    static  int search(int[] arr, int target, int start, int end){


        while (start <= end){
            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start  = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
