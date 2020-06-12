public class ValidParenthesisString {
    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3301/
     * Reference : https://leetcode.com/problems/valid-parenthesis-string/discuss/543521/Java-Count-Open-Parenthesis-O(n)-time-O(1)-space-Picture-Explain
     */
    class Solution {
        public boolean checkValidString(String s) {
            int lo = 0, hi = 0;
            for (char c : s.toCharArray()) {
                lo += c == '(' ? 1 : -1;
                hi += c != ')' ? 1 : -1;
                if (hi < 0) break;
                lo = Math.max(lo, 0);
            }
            return lo == 0;
        }
    }
}
