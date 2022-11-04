package Module_3.Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String st1 = "nagaram";
        String st2 = "nananaa";
        System.out.println(validAnagram(st1,st2));
    }
    static boolean validAnagram(String s, String t){
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();
        if(s.length()!=t.length())
            return false;
        /*else
        {
            int fq[] = new int[26];
            for(int i=0; i<s.length(); i++)
            {
                fq[s.charAt(i)-'a']++;
                fq[t.charAt(i)-'a']--;
            }
            for(int i=0; i<26; i++)
            {
                if(fq[i]!=0)
                    return false;
            }
        }
        return true; */
        else{
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(hash1.containsKey(ch)){
                    hash1.put(ch, hash1.get(ch)+1);
                }else{
                    hash1.put(ch,1);
                }
            }
            for(int j =0; j<t.length(); j++){
                char ch = t.charAt(j);
                if(hash2.containsKey(ch)){
                    hash2.put(ch, hash2.get(ch)+1);
                }else{
                    hash2.put(ch,1);
                }
            }
            for(char ch : hash1.keySet()){
                if(hash1.get(ch) != hash2.get(ch))
                    return false;
            }
        }
        return true;
    }
}
