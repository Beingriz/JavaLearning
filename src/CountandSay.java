import java.util.Scanner;

public class CountandSay {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println(CountAndSay(n));
    }
    public static String CountAndSay(int n)
    {
        if (n == 1) return "1";
        String s = CountAndSay( n-1);
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            count++;
            if(i == s.length()-1 || s.charAt(i)!=s.charAt(i+1))
            {
                res.append(count).append(s.charAt(i));
                count=0;
            }
        }
        return res.toString();
    }
}
