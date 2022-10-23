import java.util.Scanner;

public class PrintInReverseLL {
    public static void main(String[] args) {
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            list.insertAtEnd(sc.nextInt());
        }
        list.ReversePrint(list.head);
    }
}
