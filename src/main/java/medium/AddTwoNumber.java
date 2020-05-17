package medium;

import medium.model.ListNode;

public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode a = new ListNode(4);
        ListNode a1 = new ListNode(3);
        l1.next = a;
        a.next = a1;
        ListNode l2 = new ListNode(5);
        ListNode b1 = new ListNode(6);
        ListNode b2 = new ListNode(4);
        l2.next = b1;
        b1.next = b2;

        printList(addTwoNumbers(l1, l2));

    }

    public static void printList(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            int val = sum % 10;
            carry = sum / 10;
            res.next = new ListNode(val);
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + carry;
            int val = sum % 10;
            carry = sum / 10;
            res.next = new ListNode(val);
            res = res.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val + carry;
            int val = sum % 10;
            carry = sum / 10;
            res.next = new ListNode(val);
            res = res.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            res.next = new ListNode(carry);
        }
        return head.next;
    }

}
