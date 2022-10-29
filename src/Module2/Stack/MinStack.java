package Module2.Stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    Stack<Integer> ss;
    MinStack(){
        st = new Stack<Integer>();
        ss = new Stack<Integer>();
    }
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(4);
        s.push(4);
        s.push(3);
        System.out.println("Poped Value" + s.pop());
        System.out.println("Peek Value" +s.peek() );


        System.out.println( "Min Stack Value "+s.minStack());


    }
     public void push(int val){

        if(ss.empty() || val <= ss.peek()){
            ss.push(val);
        }
         st.push(val);
    }
    int peek(){
        return st.peek();
    }
      int pop(){
        if(st.empty()){
            return  -1;
        }
        if(ss.peek() == st.peek()){
            ss.pop();
        }
        return st.pop();
    }
     int minStack(){
        if(!ss.empty()){
            return ss.peek();
        }
        return -1;
    }

}
