public class LongestCommonSubsequence {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3311/
     */

    /**
     * 1. Recursive
     */
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            if (text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty()) return 0;
            return lcs(text1, text2, 0, 0);
        }

        public int lcs(String text1, String text2, int i, int j) {
            if (i == text1.length() || j == text2.length()) return 0;

            if (text1.charAt(i) == text2.charAt(j)) {
                return lcs(text1, text2, i + 1, j + 1) + 1;
            } else {
                return Math.max(lcs(text1, text2, i + 1, j), lcs(text1, text2, i, j + 1));
            }
        }
    }


    /**
     * 2. Top down DP
     */
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            if (text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty()) {
                return 0;
            }

            int m = text1.length();
            int n = text2.length();
            int[][] dp = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = -1;
                }
            }
            return lcs(text1, text2, 0, 0, dp);
        }

        public int lcs(String text1, String text2, int i, int j, int[][] dp) {
            if (i == text1.length() || j == text2.length()) {
                return 0;
            }

            if (dp[i][j] != -1) {
                return dp[i][j];
            }

            if (text1.charAt(i) == text2.charAt(j)) {
                return dp[i][j] = lcs(text1, text2, i + 1, j + 1, dp) + 1;
            } else {
                return dp[i][j] = Math.max(lcs(text1, text2, i + 1, j, dp), lcs(text1, text2, i, j + 1, dp));
            }

        }
    }


    /**
     * 3. Bottom up DP
     */
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            if (text1 == null || text2 == null || text1.isEmpty() || text2.isEmpty()) {
                return 0;
            }

            int m = text1.length();
            int n = text2.length();
            int[][] dp = new int[m + 1][n + 1];

            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i == 0 || j == 0) dp[i][j] = 0;
                    else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }

            return dp[m][n];

        }
    }
}
