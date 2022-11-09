package AccioJobAssignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestMissingNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,-3,-2,6,1,5};
        System.out.println(missingNumber(arr, arr.length));
    }
 static int missingNumber(int[] arr, int len){
        int com = 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(arr[j] <0) continue;
                else if (arr[j] == com ) {
                    com++; break;
                }
            }
        }
        return com;
    }

}
