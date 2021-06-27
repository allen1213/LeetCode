package com.example.data.structure.circle;

public class CircleLinkedListDemo {

    public static void main(String[] args) {
        CircleLinkedList linkedList = new CircleLinkedList();

        linkedList.addNode(8);
        linkedList.list();

        linkedList.count(1,3,8);
    }

}

class Node {
    private int no;
    private Node next;

    public Node(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                '}';
    }

    public int getNo() {
        return no;
    }

    public Node setNo(int no) {
        this.no = no;
        return this;
    }

    public Node getNext() {
        return next;
    }

    public Node setNext(Node next) {
        this.next = next;
        return this;
    }
}

class CircleLinkedList {

    private Node first;

    public void addNode(int nums) {
        Node temp = first;
        for (int i = 1; i <= nums; i++) {
            Node node = new Node(i);
            if (i == 1) {
                first = node;
                first.setNext(first);
                temp = first;
            }
            temp.setNext(node);
            node.setNext(first);
            temp = node;
        }
    }

    public void list() {
        if (first == null) return;
        Node temp = first;
        while (true) {
            System.out.println(temp);
            if (temp.getNext() == first) break;
            temp = temp.getNext();
        }
    }

    /**
     *
     * @param start  从第几个节点开始
     * @param countNum  数多少个节点
     * @param nums  总节点数
     */
    public void count(int start,int countNum,int nums) {
        if (start < 1 || nums < 1 || start > nums) return;

        //使用一个helper指针来指向环形链表的末尾
        Node helper = first;
        while (helper.getNext() != first) helper = helper.getNext();

        while (start -- > 0) {
            helper = helper.getNext();
            first = first.getNext();
        }

        while (true) {

            if (helper == first) {
                System.out.println(helper.getNo());
                break;
            }

            for (int i = 0; i < countNum - 1; i++) {
                helper = helper.getNext();
                first = first.getNext();
            }
            System.out.print(first.getNo() + " -> ");
            first = first.getNext();
            helper.setNext(first);

        }

    }


}
