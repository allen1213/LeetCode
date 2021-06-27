package com.example.simple;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public int length() {
        int count = 0;
        ListNode temp = this;
        while (temp.next != null)
            count ++;
        return count;
    }

}

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode node = new ListNode(-1);

        ListNode temp = node;
        while (l1 != null && l2 !=null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2= l2.next;
            }
            temp = temp.next;
        }
        temp.next = l1 == null ? l2 : l1;

        return node.next;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;node5.next = node6;

        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode listNode = m.mergeTwoLists(node1, node4);

        ListNode temp = listNode;
        while (true) {
            if (temp == null) return;
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

    /**
     * 21. 合并两个有序链表
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     *
     *
     * 示例：
     *
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */

}


