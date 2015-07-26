package com.agenthun.linkedlist;

/**
 * Created by Agent Henry on 2015/7/26.
 */
public class FindElem extends MyLinkedList {
    public Node findElem(Node head, int k) {
        if (k < 1 || k > this.length()) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k - 1; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
