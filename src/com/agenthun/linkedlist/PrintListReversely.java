package com.agenthun.linkedlist;

/**
 * Created by Agent Henry on 2015/7/26.
 */
public class PrintListReversely extends MyLinkedList {
    public void printListReversely(Node pListHead) {
        if (pListHead != null) {
            printListReversely(pListHead.next);
            System.out.println(pListHead.data);
        }
    }
}
