package Module2;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,0,1,2,3,4};
        System.out.println(countRotaitons(arr));
    }
    static int countRotaitons(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }
    static int findPivot(int[] arr){
        int start = 0,  end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return  mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return  mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
