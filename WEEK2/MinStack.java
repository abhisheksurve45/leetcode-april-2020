public class MinStack {

    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3292/
     * Reference : Use two stacks!
     */
    class MinStack {

        /**
         * initialize your data structure here.
         */
        Stack<Integer> minStack;
        Stack<Integer> stack;

        public MinStack() {
            minStack = new Stack();
            stack = new Stack();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.peek() > x) minStack.push(x);
            else minStack.push(minStack.peek());
        }

        public void pop() {
            stack.pop();
            minStack.pop();

        }

        public int top() {
            if (!stack.isEmpty()) return stack.peek();
            return -1;
        }

        public int getMin() {
            if (!minStack.isEmpty()) return minStack.peek();
            return -1;
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
