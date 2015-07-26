package com.agenthun.linkedlist;

/**
 * Created by Agent Henry on 2015/7/26.
 */
public class DeleteNodeAdv extends MyLinkedList {
    public boolean deleteNodeAdv(Node n) {
        if (n == null || n.next == null) return false;
        int temp = n.data;
        n.data = n.next.data;
        n.next.data = temp;

        n.next = n.next.next;
        return true;
    }
}
