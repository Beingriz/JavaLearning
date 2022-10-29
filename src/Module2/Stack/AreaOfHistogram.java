package Module2.Stack;

import java.util.Stack;

public class AreaOfHistogram {
    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        int[] width = new int[arr.length];
        int[] left = nearestSmallerLeft(arr);
        int[] right = nearestSmallerRight(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            width[i] = right[i]-left[i]-1;
            arr[i] = arr[i]*width[i];
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
    }

    static int[] nearestSmallerLeft(int[] arr){
        int[] left = new int[arr.length];
        Stack<Integer> st_value = new Stack<>();
        Stack<Integer> st_index = new Stack<>();
        int start = -1;
        for (int i = 0; i < arr.length; i++) {
            while (!st_value.empty() && st_value.peek() >= arr[i]){
                st_value.pop();
                st_index.pop();
            }
            if(st_value.empty()){
                left[i] =  start;
            }else{
                left[i]  = st_index.peek();
            }
            st_value.push(arr[i]);
            st_index.push(i);
        }
        return left;

    }
    static  int[] nearestSmallerRight(int[] arr){
        int[] right = new int[arr.length];
        Stack<Integer> st_value = new Stack<>();
        Stack<Integer> st_index = new Stack<>();
        int end = arr.length;
        for (int i = arr.length-1; i >= 0; i--) {
            while (!st_value.empty() && st_value.peek() >= arr[i]){
                st_value.pop();
                st_index.pop();
            }
            if(st_value.empty()){
                right[i] =  end;
            }else{
                right[i]  = st_index.peek();
            }
            st_value.push(arr[i]);
            st_index.push(i);
        }
        for (int i = arr.length-1; i >=0 ; i--) {

        }
        return right;
    }
}
