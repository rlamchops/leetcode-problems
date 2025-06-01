package easy;
//#141

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode one = head;
        ListNode two = head;

        while((one != null) && (one.next != null)) {
            one = one.next.next;
            two = two.next;
            if (one == two) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(3);
        one.next = new ListNode(2);
        one.next.next = new ListNode(0);
        one.next.next.next = new ListNode(4);
        one.next.next.next.next = one.next;
        System.out.println(hasCycle(one));

        ListNode two = new ListNode(1);
        two.next = new ListNode(2);
        two.next.next = two;
        System.out.println(hasCycle(two));

        ListNode three = new ListNode(1);
        System.out.println(hasCycle(three));
    }
}
