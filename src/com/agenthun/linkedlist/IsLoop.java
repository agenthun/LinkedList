package com.agenthun.linkedlist;

/**
 * Created by Agent Henry on 2015/7/26.
 */
public class IsLoop extends MyLinkedList {
    public boolean isLoop(Node head) {
        Node fast = this.head;
        Node slow = this.head;
        if (fast == null) return false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return !(fast == null || fast.next == null);
    }

    public Node findLoopPort(Node head) {
        Node slow = this.head;
        Node fast = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        if (fast == null || fast.next == null) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
