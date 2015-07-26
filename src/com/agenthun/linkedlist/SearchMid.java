package com.agenthun.linkedlist;

/**
 * Created by Agent Henry on 2015/7/26.
 */
public class SearchMid extends MyLinkedList {
    public Node searchMid(Node head) {
        Node p = this.head;
        Node q = this.head;
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }
}
