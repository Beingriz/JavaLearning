package Module2.Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "a*b/(d+c)*e";
        System.out.println(postFix(str));
    }
    static String postFix(String str){
        Stack<Character> st = new Stack<>();
        int len = str.length();
        String result = "";
        for (int i = 0; i < len; i++) {
            // for Operands
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                result += str.charAt(i);
            } else {
                if (st.empty()) {
                    st.push(str.charAt(i));
                } else if (str.charAt(i) == '(') {
                    st.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    while (st.peek() != '(') {
                        result += st.pop();
                    }
                    st.pop();
                } else if (priority(str.charAt(i)) > priority(st.peek()))
                    st.push(str.charAt(i));
                else if (priority(str.charAt(i)) <= priority(st.peek())) {
                    while (!st.empty() && priority(str.charAt(i)) <= priority(st.peek())) {
                        result += st.pop();
                    }
                    st.push(str.charAt(i));
                }
            }
        }
        while(!st.empty()){
            result += st.pop();
        }
        return result;
    }
    //Priority function
    public  static  int priority(char ch)
    {
        int priority = 0;
        if(ch=='^')
            priority = 3;
        else if(ch=='*' || ch=='/')
            priority = 2;
        else if(ch=='+' || ch=='-')
            priority = 1;
        return priority;
    }


}
