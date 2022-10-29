package Module2.Stack;

import java.util.Stack;

public class AreaOfRectangleInBinaryMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 0,1,1,0}, { 1,1,1,1}, { 1,1,1,1}, { 1,1,0,0} };
        int[] arr = twoDtoOneD(mat);
        int result = AreaOfHistogram(arr);
        System.out.println(result);
    }
    static int[] twoDtoOneD(int[][] mat){
        int[] result = new int[mat.length];
        int sum = 0;
        for (int j = 0; j < mat.length; j++) {
            sum = 0;
            for (int i = 0; i < mat[0].length; i++) {
                sum+=mat[i][j];
            }
            result[j] = sum;
        }
       return result;
    }
    static int AreaOfHistogram(int[] arr){
        int[] left = NSL(arr);
        int[] right = NSR(arr);
        int[] width = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            width[i] = right[i]-left[i]-1;
            arr[i] = arr[i]*width[i];
            max  = Math.max(max, arr[i]);
        }
        return  max;
    }
    static int[] NSL(int[] arr){
        int[] left = new int[arr.length];
        int start = -1;
        Stack<Integer> stv = new Stack<>();
        Stack<Integer> sti = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stv.empty() && stv.peek() >= arr[i]){
                stv.pop();
                sti.pop();
            }
            if(stv.empty()){
                left[i] = start;
            }else {
                left[i] = sti.peek();
            }
            stv.push(arr[i]);
            sti.push(i);
        }
        return left;
    }
    static int[] NSR(int[] arr){
        int[] right = new int[arr.length];
        int start = -1;
        Stack<Integer> stv = new Stack<>();
        Stack<Integer> sti = new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {
            while (!stv.empty() && stv.peek() >= arr[i]){
                stv.pop();
                sti.pop();
            }
            if(stv.empty()){
                right[i] = start;
            }else {
                right[i] = sti.peek();
            }
            stv.push(arr[i]);
            sti.push(i);
        }
        int[] temp = new int[right.length];
        for (int i = right.length-1; i >=0 ; i--) {
            temp[right.length-1-i] = right[i];
        }
        return temp;
    }
}
