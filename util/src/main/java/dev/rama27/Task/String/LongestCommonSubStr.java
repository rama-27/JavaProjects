package dev.rama27.Task.String;

public class LongestCommonSubStr {
    public String longestCommonSubStr(String s1,String s2){
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return "";
        }

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        int maxLength = 0;
        int endIndexStr1 = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndexStr1 = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        if (maxLength == 0) {
            return "";
        }

        return s1.substring(endIndexStr1 - maxLength, endIndexStr1);
    }


}
