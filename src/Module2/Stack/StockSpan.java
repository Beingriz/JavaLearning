package Module2.Stack;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4};
        int[] index = new int[arr.length];

        Stack<Integer> stv = new Stack<>(); // to store the Next Greater Element in Module2.Stack
        Stack<Integer> sti = new Stack<>(); // to Store the Next Greater Element index in Module2.Stack

        for (int i = 0; i < arr.length; i++) {
            while (!stv.empty() && stv.peek() <= arr[i]){ // untill stack is empty or next Greater Element is Reached
                stv.pop();
                sti.pop();
            }
            if (stv.empty()){
                index[i] = -1;
            }else{
                index[i] = sti.peek(); // Storing the index of Next Greater Element towards Left
            }
            stv.push(arr[i]);
            sti.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            index[i] = i - index[i];  // Actual Value to be Stores using present i value -  index of i
            System.out.print(index[i] + " ");
        }
    }
}
