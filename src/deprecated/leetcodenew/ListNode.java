package deprecated.leetcodenew;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        if (next == null) {
            return val + " -> null";
        }
        return val + " -> " + next;
    }
}
