public class SearchRotatedSortedArray {
    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3304/
     */
    class Solution {
        public int search(int[] A, int target) {
            if (A.length == 0) return -1;
            int lo = 0;
            int hi = A.length - 1;
            while (lo < hi) {
                int mid = (lo + hi) / 2;
                if (A[mid] == target) return mid;

                if (A[lo] <= A[mid]) {
                    if (target >= A[lo] && target < A[mid]) {
                        hi = mid - 1;
                    } else {
                        lo = mid + 1;
                    }
                } else {
                    if (target > A[mid] && target <= A[hi]) {
                        lo = mid + 1;
                    } else {
                        hi = mid - 1;
                    }
                }
            }
            return A[lo] == target ? lo : -1;
        }
    }
}
