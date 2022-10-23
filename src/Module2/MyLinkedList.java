package Module2;

public class MyLinkedList {
    Node head;
    void insert(int val){
        Node new_node = new Node(val);
        if(head == null)
        {
            head = new_node;
            return;
        }
        Node temp = this.head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
    }
    void print()
    {
        Node temp = this.head;
        while(temp!=null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }


    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
