package Module2.InterviewImportant;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/*
https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1
* */

public class ReverseKQueueElements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> rq = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        while (!st.empty()){
            rq.add(st.pop());
        }
        while (q.size()>0){
            rq.add(q.remove());
        }
        System.out.println(rq);
    }
}
