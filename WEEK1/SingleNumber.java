public class SingleNumber{

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3283/
     * Reference : Read xor technique
     */
    class Solution {
        public int singleNumber(int[] nums) {
            int x = nums[0];
            for(int i=1; i<nums.length;i++){
                x ^= nums[i];
            }
            return x;
        }
    }
}
