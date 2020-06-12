public class MaximalSquare {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3312/
     * Video : https://www.youtube.com/watch?v=oPrpoVdRLtg
     */
    class Solution {
        public int maximalSquare(char[][] matrix) {

            int m = matrix.length;

            if (m == 0 || matrix[0] == null || matrix[0].length == 0) {
                return 0;
            }

            int n = matrix[0].length;

            int[][] dp = new int[m][n];
            int answer = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '1') {
                        dp[i][j] = 1;
                        if (i > 0 && j > 0) {
                            dp[i][j] += Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));

                        }
                        answer = Math.max(answer, dp[i][j]);
                    } else {
                        dp[i][j] = 0;
                    }
                }
            }

            return answer * answer;
        }
    }
}
