package com.example.simple;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;

        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();

        ListNode listNode = r.deleteDuplicates(node1);

        ListNode temp = listNode;
        while (temp != null) {
            System.out.print(temp.val + "\t");
            temp = temp.next;
        }

        System.out.println();

    }
}

/**
 * 83. 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
