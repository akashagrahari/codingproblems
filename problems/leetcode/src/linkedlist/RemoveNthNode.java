package linkedlist;

import linkedlist.common.ListNode;

public class RemoveNthNode {
    public static void main(String[] args) {
        RemoveNthNode obj = new RemoveNthNode();
        obj.removeNthFromEnd(ListNode.basicOrderList(), 5).printList();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headL = head;
        ListNode headR = head;

        int i=0;
        while(i<n) {
            headR = headR.next;
            i++;
        }

        if (headR == null) {
            return head.next;
        }

        while(headR.next != null) {
            headL = headL.next;
            headR = headR.next;
        }

        headL.next = headL.next.next;

        return head;
    }
}
