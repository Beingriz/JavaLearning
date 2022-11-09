package Module2.InterviewImportant;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseCharStringtoString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char[] ch = new char[str.length()];
       ch = str.toCharArray();
        System.out.println(charToRevString(ch));
    }
    static String charToRevString(char[] ch){
      String str = String.valueOf(ch);
      int len = str.length();
      StringBuffer ans = new StringBuffer();
        for (int i = len-1; i >=0 ; i--) {
            ans.append(str.charAt(i));
        }
        String res = ans.toString();
        return res;
    }
}
