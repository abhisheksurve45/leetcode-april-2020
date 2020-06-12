public class NumberofIslands {
    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3302/
     */
    class Solution {
        public int numIslands(char[][] grid) {
            if (grid.length == 0) return 0;

            int islands = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1')
                        islands += dfs(grid, i, j);
                }
            }

            return islands;
        }

        public int dfs(char[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') return 0;

            grid[i][j] = '0';

            dfs(grid, i + 1, j);
            dfs(grid, i, j + 1);
            dfs(grid, i - 1, j);
            dfs(grid, i, j - 1);
            return 1;
        }
    }
}
