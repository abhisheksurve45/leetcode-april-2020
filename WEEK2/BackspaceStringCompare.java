public class BackspaceStringCompare {
    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3291/
     */
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            return buildString(S).equals(buildString(T));
        }

        public String buildString(String str) {
            if (str == null || str.isEmpty()) return "";

            Stack<Character> st = new Stack<>();

            for (Character c : str.toCharArray()) {
                if (c == '#') {
                    if (!st.isEmpty()) st.pop();
                } else {
                    st.add(c);
                }
            }
            return String.valueOf(st);
        }
    }
}
