package linkedlist;

import linkedlist.common.ListNode;

import java.util.Stack;

public class ReorderList {
    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode list = ListNode.basicOrderList();
        list.printList();
        System.out.println();
        reorderList.reorderList(list);
        list.printList();
    }

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode headTemp = head;

        int count = 0;
        while(headTemp != null) {
            stack.push(headTemp);
            count++;
            headTemp = headTemp.next;
        }
        int mid = count/2;
        int i = 0;
        headTemp = head;
        while(i < mid) {
            ListNode temp = headTemp.next;
            headTemp.next = stack.pop();
            headTemp = headTemp.next;
            headTemp.next = temp;
            headTemp = headTemp.next;
            i++;
        }
        headTemp.next = null;
    }
}
