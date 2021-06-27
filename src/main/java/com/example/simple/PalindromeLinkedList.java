package com.example.simple;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        //用快慢两个指针分别指向链表中间和末尾
        ListNode slow = head, fast = head;

        //temp指针遍历，node指针反转前半部分链表
        ListNode temp, node = null;

        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
            temp.next = node;
            node = temp;
        }

        //若链表有效个数为奇数时，slow还要往下在走一步
        if (fast != null) {
            slow = slow.next;
        }

        //此时，slow指向中间，node为前半部分的反转链表
        while (slow != null && node != null) {
            if (slow.val != node.val) return false;
            slow = slow.next;
            node = node.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList p = new PalindromeLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(p.isPalindrome(node1));
    }


}

/**
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
