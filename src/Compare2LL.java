import java.util.Scanner;

public class Compare2LL {
    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i=0; i<m; i++)
        {
            list1.insertAtEnd(sc.nextInt());
        }
        for (int j=0; j<n; j++)
        {
            list2.insertAtEnd(sc.nextInt());
        }
        LL.isSame(list1.head, list2.head);


    }
}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
class LL{
    Node head;

    void insertAtEnd(int val) // Method to insert the Node at the End
    {
        Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!= null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    static void isSame(Node head1, Node head2) // Method to check Elements of Node are same or Not
    {
        while(head1!=null && head2!=null)
        {
            if(head1.data == head2.data )
            {
                head1 = head1.next;
                head2 = head2.next;
            }
            else
            {
                System.out.println(0);
                return;
            }
        }
        if(head1!=null || head2!=null)
        {
            System.out.println(0);
        }else {
            System.out.println(1);
        }
    }
    void ReversePrint(Node head)
    {
        if(head == null) return;
        else
            ReversePrint(head.next);
        System.out.print(head.data + " ");
    }
}