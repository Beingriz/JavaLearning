package Module2.BinarySearch.AdtiyaVerrma;

public class FirstAndLastOccarance {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,1,1,1,1,1};
        int target = 0;
        System.out.println("First Occarance "+FirstOccarance(arr, target));
        System.out.println("Last Occarance "+LastOccarance(arr, target));
        System.out.println("Count " + (LastOccarance(arr,target) - FirstOccarance(arr, target)+1));
    }
    static int FirstOccarance(int[] arr, int taret){
        int start  =0 ;
        int end = arr.length-1;
        int result = -1;
        int count = 0;
        while (start <= end){
            int mid = start+(end-start)/2;
            if(taret > arr[mid]){
                start = mid+1;
            } else if (taret < arr[mid]) {
                end = mid-1;
            }else{
                result = mid;
                count++;
                end = mid-1;
            }
        }
        return result;
    }


    static int LastOccarance(int[] arr, int taret){
        int start  =0 ;
        int end = arr.length-1;
        int result = -1;
        int count=0;
        while (start <= end){
            int mid = start+(end-start)/2;
            if(taret > arr[mid]){
                start = mid+1;
            } else if (taret < arr[mid]) {
                end = mid-1;
            }else{
                result = mid;
                count++;
                start = mid+1;
            }
        }
        return result;
    }
}
