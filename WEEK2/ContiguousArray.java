public class ContiguousArray {
    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3298/
     * Reference : Map used as store for [count,index]
     */
    class Solution {
        public int findMaxLength(int[] nums) {
            if (nums.length == 0) return 0;

            Map<Integer, Integer> store = new HashMap<>();
            store.put(0, -1);

            int maxcount = 0, count = 0;
            for (int i = 0; i < nums.length; i++) {
                count = count + (nums[i] == 1 ? 1 : -1);

                if (store.containsKey(count)) {
                    maxcount = Math.max(maxcount, i - store.get(count));
                } else {
                    store.put(count, i);
                }
            }

            return maxcount;
        }
    }
}
