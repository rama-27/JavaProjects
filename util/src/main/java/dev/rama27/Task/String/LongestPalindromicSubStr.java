package dev.rama27.Task.String;

public class LongestPalindromicSubStr {
    public String longestPalindrome(String s){
        if (s == null || s.length() < 1) {
            return "";
        }

        int n = s.length();
        if (n == 1) {
            return s;
        }

        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLength);

    }
}
