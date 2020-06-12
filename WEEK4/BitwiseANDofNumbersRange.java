public class BitwiseANDofNumbersRange {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3308/
     * Reference : https://leetcode.com/problems/bitwise-and-of-numbers-range/discuss/56721/2-line-Solution-with-detailed-explanation
     */
    class Solution {
        public int rangeBitwiseAnd(int m, int n) {
            while (m < n) {
                n = n - (n & -n);
            }
            return n;
        }
    }
}
