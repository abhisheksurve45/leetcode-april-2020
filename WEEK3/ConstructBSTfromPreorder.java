public class ConstructBSTfromPreorder {
    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3305/
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
        public TreeNode bstFromPreorder(int[] preorder) {
            if (preorder.length == 0) return null;
            return constructBstFromPreorder(preorder, 0, preorder.length - 1);
        }

        public TreeNode constructBstFromPreorder(int[] preorder, int start, int end) {
            if (start > end) return null;

            TreeNode root = new TreeNode(preorder[start]);

            int i;
            for (i = start; i <= end; i++) {
                if (preorder[i] > root.val) {
                    break;
                }
            }
            root.left = constructBstFromPreorder(preorder, start + 1, i - 1);
            root.right = constructBstFromPreorder(preorder, i, end);
            return root;
        }
    }

    /**
     * Video : https://www.youtube.com/watch?v=aaMszQmJ9MU
     */
    class Solution {
        int index = 0;

        public TreeNode bstFromPreorder(int[] preorder) {
            if (preorder == null || preorder.length == 0) return null;
            return constructBstFromPreorder(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        public TreeNode constructBstFromPreorder(int[] preorder, int start, int end) {
            if (index >= preorder.length) return null;

            TreeNode root = null;
            int key = preorder[index];

            if (key > start && key < end) {
                root = new TreeNode(key);
                index++;
                root.left = constructBstFromPreorder(preorder, start, key);
                root.right = constructBstFromPreorder(preorder, key, end);
            }

            return root;
        }
    }

}
