package LongestSubstring;

import java.util.HashMap;

public class solution_with_hashmap {
    static int finding_the_longest_substring(String kelime) {
        HashMap<Character, Integer> diz = new HashMap<>();
        int length = 0;
        int begining = 0;
        for(int end = 0; end < kelime.length(); end++) {
            if(diz.containsKey(kelime.charAt(end))) {
                begining = diz.get(kelime.charAt(end)) + 1; //Math.max(bas, diz.get(kelime.charAt(end)) + 1);
            }
            diz.put(kelime.charAt(end), end);
            length = Math.max(length, end-begining + 1);
            System.out.println(diz);
        }
        return length;
    }
    public static void main(String []args) {
        String s = "abcabcbb";
        int dizi = finding_the_longest_substring(s);
        System.out.println("The longest_substring: " + dizi);
    }
}
