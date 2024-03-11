package linkedlist;

import linkedlist.common.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode.basicOrderList().printList();
        obj.reverseList(ListNode.basicOrderList()).printList();
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
