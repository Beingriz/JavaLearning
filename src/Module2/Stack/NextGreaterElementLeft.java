package Module2.Stack;

import java.util.Stack;

public class NextGreaterElementLeft {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <arr.length; i++) {
            while (!st.empty() && st.peek() <=arr[i]){
                st.pop();
            }
            if(st.empty()){
                result[i] = -1;
            }else{
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
