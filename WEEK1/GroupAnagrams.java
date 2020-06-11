public class GroupAnagrams {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3288/
     */
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {

            if (strs.length == 0) return new ArrayList<>();

            Map<String, List> anag = new HashMap<>();

            for (String str : strs) {

                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sortedStr = String.valueOf(chars);

                if (!anag.containsKey(sortedStr)) {
                    anag.put(sortedStr, new ArrayList<>());
                }

                anag.get(sortedStr).add(str);

            }

            return new ArrayList(anag.values());

        }
    }
}
