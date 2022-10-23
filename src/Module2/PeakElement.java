package Module2;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,4,3,2,1,0};
        System.out.println(searchPeak(arr));
    }
    static int searchPeak(int[] arr){
        int low=0;
        int hight = arr.length-1;
        while (low < hight){
            int mid = low + (hight - low) / 2;
            if (arr[mid] > arr[mid+1]) {
                hight = mid;
            }else
                low = mid+1;
        }
        return low;

    }
}
