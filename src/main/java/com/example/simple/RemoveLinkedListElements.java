package com.example.simple;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        /*if(head == null) return null;
        ListNode node = new ListNode(-1);
        node.next = head;

        ListNode temp = node;
        while (true) {
            if (temp == null) break;
            while (temp.next!=null && temp.next.val == val)
                temp.next = temp.next.next;
            temp = temp.next;
        }

        return node.next;*/

        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        return sentinel.next;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;node4.next = node5;node5.next = node6; node6.next = node7;

        RemoveLinkedListElements r = new RemoveLinkedListElements();

        ListNode listNode = r.removeElements(node1,6);

        ListNode temp = listNode;
        while (temp != null) {
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }

        System.out.println();
    }
}

/**
 *203. 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
