public class BinaryTreeMaximumPathSum {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/532/week-5/3314/
     * Video : https://www.youtube.com/watch?v=ZRvME06C-fY
     */

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        int max_sum = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            if (root == null) return max_sum;
            calculateMaxGain(root);
            return max_sum;
        }

        public int calculateMaxGain(TreeNode root) {
            if (root == null) return 0;

            int left = Math.max(calculateMaxGain(root.left), 0);
            int right = Math.max(calculateMaxGain(root.right), 0);

            int local_max = root.val + left + right;

            max_sum = Math.max(max_sum, local_max);

            return Math.max(left, right) + root.val;
        }

    }
}
