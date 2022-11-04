package AccioJobAssignments;
    /*
    Problem Link : https://course.acciojob.com/idle?question=00d425f1-a20e-4549-afb2-4e1cd07ad3fd
    */
import java.util.Scanner;

// Finding the Largest Sub array with Sum K
public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
        /*
        int[] arr = {10, 5, 2, 7, 1, 9};
        int[] arr = {-5,8, -14, 2 ,4 ,12};
        int[] arr = {-1, 2, 3};
        int k = 6;
        System.out.println(largestSubarraywithSumK(arr, k));
        */

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int k =sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
            System.out.println(largestSum(arr,k));
            t--;
        }

    }
    static int largestSum(int[] arr, int k){
        int len = arr.length;
        int preLength = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = 0;
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if(sum == k){
                    if((j-i+1) > preLength)
                        preLength = (j-i+1);
                }
            }
        }
        return preLength;
    }
}
