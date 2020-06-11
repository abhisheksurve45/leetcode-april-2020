public class LastStoneWeight {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3297/
     */
    class Solution {
        public int lastStoneWeight(int[] stones) {
            if (stones.length == 0) return 0;

            Queue<Integer> sq = new PriorityQueue<Integer>((x, y) -> y - x);

            for (int stone : stones) {
                sq.add(stone);
            }

            while (sq.size() >= 2) {
                int stone1 = sq.poll();
                int stone2 = sq.poll();

                if (stone1 != stone2) {
                    sq.add(stone1 - stone2);
                }
            }

            return sq.size() <= 0 ? 0 : sq.peek();
        }
    }
}
