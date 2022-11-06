package LongestSubstring;

import java.util.ArrayList;
import java.util.List;

public class Longest_substr {
    /*
Given a string s, find the length of the longest substring without repeating characters.

 Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    public static void main(String[] args) {
        String test_string="abcabcdebb";

        List<String> string_converted_to_list= convert_to_list(test_string);

        int the_length_of_the_longest_one=longest_sub_string(string_converted_to_list);

        System.out.println("The length of the longest substring of the string given above: "
                +the_length_of_the_longest_one);

    }

    private static int longest_sub_string(List<String> string_converted_to_list) {
        int size=string_converted_to_list.size();
        String str="";
        List<String> str_list=new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = i; j <size+1; j++) {
              List<String> sublist= string_converted_to_list.subList(i,j);
                str ="";

                for (String s : sublist) {
                    if (!str.contains(s))
                    {
                        str+=s;
                        if (!str_list.contains(str))
                            str_list.add(str);
                    }
                }

            }

        }

        System.out.println(str_list);

        int max_size=0;
        for (String s : str_list) {
            if (s.length() > max_size)
                max_size = s.length();
        }

        return max_size;

    }

    private static List<String> convert_to_list(String test_string) {

        String[] array_of_string=test_string.split("");

        List<String> list_of_string=new ArrayList<>();

        for (int i = 0; i < test_string.length(); i++) {

            list_of_string.add(array_of_string[i]);
        }

        return list_of_string;
    }


}
