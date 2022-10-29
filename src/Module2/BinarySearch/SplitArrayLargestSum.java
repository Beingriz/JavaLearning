package Module2.BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(binarySearch(arr, m));

    }
    static int binarySearch(int[] arr, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);  // starting range must be max element of an array
            end += arr[i];  // ending range will be max of array
        }

        while(start < end){
            int mid = start + (end-start)/2;
            int sum = 0; // to have the sum of subarrays of max size of mid
            int pieces = 1;  //  to cound the no of sub arrays with max sum
            for (int num:arr) { // enhanced for each loop.
                if(sum+num >= mid){  // if sum of subarry is greater than mid need to create new sub array
                    sum = num; //  summ will be from that element
                    pieces++; // new sub array count
                }else
                    sum+=num;  // add sum until it is less than mid
            }
            if(pieces > m){  // check the no of pieces is equal to m given in question
                start = mid+1;
            }else{
                end =mid;
            }
        }
        return end; // because end == start == mid;
    }
}
