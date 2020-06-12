public class JumpGame {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3310/
     * Video : https://leetcode.com/problems/jump-game/discuss/682883/JAVA-Detailed-Explanation-w-code
     */
    class Solution {
        public boolean canJump(int[] nums) {

            int lastGoodPos = nums.length - 1;

            for (int i = lastGoodPos - 1; i >= 0; i--) {
                if (nums[i] + i >= lastGoodPos) {
                    lastGoodPos = i;
                }
            }

            return lastGoodPos == 0;
        }
    }
}
