public class MinimumPathSum {
    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3303/
     */
    class Solution {
        public int minPathSum(int[][] grid) {
            if (grid.length == 0) return 0;

            int m = grid.length;
            int n = grid[0].length;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j != 0) grid[i][j] += grid[i][j - 1];
                    if (i != 0 && j == 0) grid[i][j] += grid[i - 1][j];
                    if (i != 0 && j != 0) grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                }
            }

            return grid[m - 1][n - 1];
        }
    }
}
