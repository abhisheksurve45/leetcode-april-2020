public class ProductArrayExceptSelf {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3300/
     */
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] result = new int[nums.length];

            result[0] = 1;
            int right = 1;


            for (int i = 1; i < nums.length; i++) {
                result[i] = result[i - 1] * nums[i - 1];
            }

            for (int i = nums.length - 1; i >= 0; i--) {
                result[i] = right * result[i];
                right = right * nums[i];
            }

            return result;
        }
    }
}
