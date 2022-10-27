package Module2;

import java.util.Stack;

public class NextSmallestElementLeft {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        int[] result = new int[arr.length];
        Stack<Integer> st  = new Stack<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            while(!st.empty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.empty()){
                result[i] = -1;
            }else{
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(result[i] + " ");

        }
    }
}
