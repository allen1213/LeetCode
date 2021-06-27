package com.example.simple;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null) return null;

        ListNode node = null;

        ListNode temp = head;
        while (temp != null) {

            ListNode next = temp.next;

            temp.next = node;
            node = temp;


            temp = next;
        }

        return node;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseLinkedList r = new ReverseLinkedList();

        ListNode listNode = r.reverseList(node1);

        ListNode temp = listNode;
        while (temp != null) {
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }

        System.out.println();

    }
}
/**
 * 206. 反转链表
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
