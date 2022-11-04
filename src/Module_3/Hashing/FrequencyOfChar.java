package Module_3.Hashing;

import java.util.HashMap;

public class FrequencyOfChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String str = "abcdefghijklmnopqrstuvwxasdasda";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
//        System.out.println(hm);
         // Finding Maximum Freq in a Hashmap
        int MaxFreq = 0;
        char ans = ' ';
        for (Character ch: hm.keySet()) {
            if(MaxFreq < hm.get(ch)){
                MaxFreq = hm.get(ch);
                ans = ch;
            }
        }
        System.out.println("Maximum Freq of " + ans + " is " + MaxFreq);
    }
}
