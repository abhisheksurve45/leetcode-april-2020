public class LRUCache {


    /**
     * Question : https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3309/
     * Video : https://leetcode.com/problems/lru-cache/discuss/682882/JAVA-Detailed-Explanation-w-code
     */

    class LRUCache {

        class Node {
            int key, value;
            Node prev, next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        Node head, tail;
        int size;
        Map<Integer, Node> map;

        public LRUCache(int capacity) {
            head = null;
            tail = null;
            size = capacity;
            map = new HashMap<>();
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
                setHead(node);
                return node.value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                Node node = map.get(key);
                node.value = value;
                remove(node);
                setHead(node);
            } else {
                if (size == map.size()) {
                    map.remove(tail.key);
                    remove(tail);
                }
                Node node = new Node(key, value);
                map.put(key, node);
                setHead(node);
            }
        }

        private void remove(Node node) {
            if (node.prev != null) {
                node.prev.next = node.next;
            } else {
                head = head.next;
            }

            if (node.next != null) {
                node.next.prev = node.prev;
            } else {
                tail = node.prev;
            }
        }

        private void setHead(Node node) {
            node.prev = null;
            node.next = head;
            if (head != null) {
                head.prev = node;
            }
            head = node;
            if (tail == null) {
                tail = node;
            }
        }
    }

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
