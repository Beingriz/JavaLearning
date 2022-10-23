import java.util.Scanner;

public class Strings {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Toggle(s));
    }
    public static String Toggle(String s)
    {
        char[] ch = s.toCharArray();
        int n = ch.length;
        for(int i=0; i<n; i++)
        {
            if(ch[i] >='A' && ch[i]<='Z')
            {
                ch[i] = (char)(ch[i]+'a'-'A');
            }
            else if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                ch[i] = (char)(ch[i]+'A'-'a');
            }
        }
        String res = new String(ch);
        return res;
    }
}
