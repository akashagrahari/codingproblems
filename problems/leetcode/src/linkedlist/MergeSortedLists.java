package linkedlist;

import linkedlist.common.ListNode;

public class MergeSortedLists {
    public static void main(String[] args) {
        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);

        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(1, b2);

        MergeSortedLists obj = new MergeSortedLists();
        obj.mergeTwoLists(a1, b1).printList();

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
                return list1;
        }

        ListNode result;
        if (list1.val <= list2.val) {
            result = list1;
            list1 = list1.next;
        } else {
            result = list2;
            list2 = list2.next;
        }
        ListNode resultTemp = result;

        while(list1 != null && list2 != null) {
            ListNode nextNode;
            if (list1.val <= list2.val) {
                nextNode = list1;
                list1 = list1.next;
            } else {
                nextNode = list2;
                list2 = list2.next;
            }

            resultTemp.next = nextNode;
            resultTemp = resultTemp .next;
        }

        ListNode remainingList = list1 == null ? list2 : list1;

        while (remainingList != null) {
            resultTemp.next = remainingList;
            remainingList = remainingList.next;
            resultTemp = resultTemp.next;
        }


        return result;
    }
}
