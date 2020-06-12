public class SubarraySumEqualsK {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3307/
     * Reference : https://leetcode.com/articles/subarray-sum-equals-k/
     */
    class Solution {
        public int subarraySum(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int count = 0;

            map.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                int n = map.getOrDefault(sum - k, 0);
                count += n;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }
}
