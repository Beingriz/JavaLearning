package Module2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeLL {
    public static void main(String[] args) {
        LL firstList  = new LL();
        LL secondList  = new LL();
        LL resultList  = new LL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("Enter n list nos");
        for(int i=0; i<n; i++)
        {
            firstList.insertAtEnd(sc.nextInt());
        }
        System.out.println("Enter m list nos");
        for(int j=0; j<m; j++)
        {
            secondList.insertAtEnd(sc.nextInt());
        }
        int firstListSum = LL.findSum(firstList.head);
        System.out.println("Total of first List "+ firstListSum);
        int secondListSum = LL.findSum(secondList.head);
        System.out.println("Total of first List "+ secondListSum);
        int total = firstListSum+secondListSum;
        System.out.println("Total of first List "+ total);
        while (total>0)
        {
            int reminder = total%10;
            resultList.insertAtHead(reminder);
            total/=10;
        }
        resultList.print();

    }
}
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
class LL{
    Node head;
    void insertAtEnd(int val)
    {
        Node nn = new Node(val);
        if(head ==  null)
        {
            head=nn;
            return;
        }
        Node temp = this.head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = nn;
    }
    void insertAtHead(int val)
    {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
    }
    void deleteAtHead()
    {
        head = head.next;
    }
    void print()
    {
        Node temp = head;
        System.out.print("Linked List ");
        while (temp!=null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    static int findSum(Node head)
    {
        int sum = 0;
        while(head!=null)
        {
            sum =(sum*10)+head.val;
            head = head.next;
        }
        return sum;
    }
}