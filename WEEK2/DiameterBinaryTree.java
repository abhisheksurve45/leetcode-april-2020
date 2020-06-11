public class DiameterBinaryTree {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3293/
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
        int ans = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            if (root == null) return ans;
            diameterOfBinaryTreeHelper(root);
            return ans;
        }

        public int diameterOfBinaryTreeHelper(TreeNode root) {

            if (root == null) return 0;

            int diaLeft = diameterOfBinaryTreeHelper(root.left);
            int diaRight = diameterOfBinaryTreeHelper(root.right);

            ans = Math.max(ans, diaLeft + diaRight);
            return Math.max(diaLeft, diaRight) + 1;
        }

    }
}
