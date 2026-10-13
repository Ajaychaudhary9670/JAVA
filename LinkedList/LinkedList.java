package LinkedList;

import SearchingAndSorting.bubbleSort;
import Stack.reverse;
import Stack.stackRev;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // O(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) { // O(1)
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail = newNode;

    }

    public void printLinkedList(LinkedList ll) { // O(n)
        Node temp = head;
        if (temp == null) {
            System.out.println("linkedList empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;

        }
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i != idx - 1) {
            temp = temp.next;
            i++;

        }
        newnNode.next = temp.next;
        temp.next = newnNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("linkedList is empty");
            return -1;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("linkedList is empty");
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static int itrSearch(int key) { // O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {

                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;

    }

    public void reverse() {   //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addLast(19);
        ll.addLast(1);
        ll.add(2, 34);
        ll.printLinkedList(ll);
        System.out.println(size);
        ll.removeFirst();
        ll.printLinkedList(ll);
        System.out.println(size);
        ll.removeLast();
        ll.printLinkedList(ll);
        System.out.println(size);
        System.out.println(itrSearch(34));
        System.out.println(itrSearch(1000));
        ll.reverse();
        ll.printLinkedList(ll);
    }
}
