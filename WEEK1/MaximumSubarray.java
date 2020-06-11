public class MaximumSubarray {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3285/
     * Refrence : Kadane's algorithm
     */
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxsum = nums[0];
            int local_max = nums[0];

            for (int i = 1; i < nums.length; i++) {
                local_max = Math.max(nums[i], local_max + nums[i]);
                maxsum = Math.max(local_max, maxsum);
            }

            return maxsum;
        }
    }
}
