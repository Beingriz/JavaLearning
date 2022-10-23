import java.util.Scanner;

public class Practice {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Program to Execut");
        System.out.println("1. Prime Numbers");
        System.out.println("2.Amstrong No");
        int ans = sc.nextInt();
        do {
            if(ans == 1)
            {
                System.out.println("**Prime Numbers Finder**");
                System.out.println("Enter the No to Find is Prime or not! ");
                int n = sc.nextInt();
                PrimeNo(n);
            }

        }while ( ans != 0);
    }
    public static void PrimeNo(int n)
    {
        int count = 0;
        for(int i=1; i<n; i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println(n + "is a Prime No");
        }
        else
        {
            System.out.println(n + "is Not a Prime No");
        }
    }

}
