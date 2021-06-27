package com.example.data.structure;

public class DoubleLinkedListDemo {

    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList();

        Node endGame = new Node(1, "end game", "end game");
        Node daylight = new Node(2, "daylight", "daylight");
        Node delicate = new Node(3, "delicate", "delicate");
        Node dress = new Node(4,"dress","dress");

        linkedList.addNode(endGame);
        linkedList.addNode(daylight);
        linkedList.addNode(delicate);
        linkedList.addNode(dress);

        //linkedList.list();

        Node cruelSummer = new Node(4, "cruel summer", "cruel summer");
        linkedList.updateByNodeNo(cruelSummer);

        linkedList.deleteByNodeNo(1);

        linkedList.list();


    }

}

class Node {
    public int no;
    public String name;
    public String nickName;
    public Node next;
    public Node pre;

    public Node(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

class DoubleLinkedList {
    private Node head = new Node(0,"","");

    public Node getHead() {
        return head;
    }

    public void list() {
        if (head.next == null) return;

        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void addNode(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null) {
                temp.next = node;
                node.pre = temp;
                break;
            }
            temp = temp.next;
        }
    }

    public void updateByNodeNo(Node node) {
        if (head.next == null) return;

        Node temp = head;
        while (temp != null) {
            if (temp.no == node.no) {
                temp.name = node.name;
                temp.nickName = node.nickName;
            }
            temp = temp.next;
        }
    }

    public void deleteByNodeNo(int no) {
        if (head.next == null) return;
        Node temp = head;
        while (temp != null) {

            if (temp.no == no) {
                temp.pre.next = temp.next;
                if (temp.next != null) temp.next.pre = temp.pre;
                break;
            }
            temp = temp.next;
        }

    }

}
