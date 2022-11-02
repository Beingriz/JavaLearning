package Module2.BinarySearch;

import java.util.Scanner;

public class FindMinTime {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }
        System.out.println(findMinTime(arr, k));
    }
    static  int findMinTime(int[] arr, int k){
        int time = 0;
        while(true){
            int prod = 0;
            for (int i = 0; i < arr.length; i++) {
                prod += (time / arr[i]);
            }
            if(prod >= k)
                return time;
            time++;
        }
    }
}
