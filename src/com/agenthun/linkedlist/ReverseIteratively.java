package com.agenthun.linkedlist;

/**
 * Created by Agent Henry on 2015/7/26.
 */
public class ReverseIteratively extends MyLinkedList {
    public void reverseIteratively(Node head) {
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null) pReversedHead = pNode;
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        this.head = pReversedHead;
    }
}
