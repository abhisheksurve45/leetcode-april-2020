public class MoveZeroes {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/
     * Reference : Two pointer approach
     */
    class Solution {
        public void moveZeroes(int[] nums) {
            int x = 0, y = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    y++;
                } else {
                    nums[x++] = nums[y++];
                }
            }

            for (; x < nums.length; x++) {
                nums[x] = 0;
            }
        }
    }
}
