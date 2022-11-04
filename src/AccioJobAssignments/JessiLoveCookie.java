package AccioJobAssignments;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
    Problem Link : https://course.acciojob.com/idle?question=00fef3df-22c8-4980-a6eb-4f6712dc8eab
   */
public class JessiLoveCookie {
        public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k =sc.nextInt();
            for (int i = 0; i < n; i++) {
                pq.add(sc.nextInt());
            }
//            System.out.println(pq);
            int count=0;
            while (pq.peek() < k) {
                if (pq.size() >= 2) {
                    int x = pq.remove();
                    int y = pq.remove();
                    y = x + (2 * y);
                    pq.add(y);
                    count++;
                } else {
                    count--;
                    break;
                }
            }
            System.out.println(count);

//
        }


}
