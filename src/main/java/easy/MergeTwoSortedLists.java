package easy;
//#21
public class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode combined = new ListNode();
        ListNode head = combined;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                combined.next = list1;
                combined = combined.next;
                list1 = list1.next;
            }
            else {
                combined.next = list2;
                combined = combined.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            combined.next = list2;
        }
        if (list2 == null) {
            combined.next = list1;
        }
        return head.next;
    }

    public static String printList(ListNode list) {
        String returnValue = "";
        while (list != null) {
            returnValue += list.val;
            list = list.next;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode two = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(printList(one));
        System.out.println(printList(two));
        System.out.println(printList(mergeTwoLists(one, two)));
    }
}