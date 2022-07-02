package coding.questions;

/*
Q-> Find the longest substring without repetition
Eg -> "abcdab" will give output "abcd"
 */

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepetitiveSubstring {

    public static void main(String[] args) {
        String str = "abcdab";
        String longestSubstring = getLongestSubstring(str);
        System.out.println(longestSubstring);

        String str2 = "abacdab";
        longestSubstring = getLongestSubstring(str2);
        System.out.println(longestSubstring);
    }

    private static String getLongestSubstring(String str) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder longestTillNow = new StringBuilder("");
        String longestOverall = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charSet.contains(c)) {
                longestTillNow = new StringBuilder("");
                charSet.clear();
            }
            longestTillNow.append(c);
            charSet.add(c);

            if (longestTillNow.length() > longestOverall.length())
                longestOverall = String.valueOf(longestTillNow);
        }
        return longestOverall;
    }
}