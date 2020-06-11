public class HappyNumber {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3284/
     */
    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> seen = new HashSet<Integer>();
            set.add(n);
            while (n != 1) {
                int result = 0;
                while (n != 0) {
                    result += Math.pow(n % 10, 2);
                    n /= 10;
                }
                if (set.contains(result)) {
                    return false;
                }
                set.add(result);
                n = result;
            }
            return true;
        }
    }
}
