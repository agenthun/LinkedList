package com.agenthun.linkedlist;

/**
 * Created by Agent Henry on 2015/7/26.
 */
public class IsIntersect extends MyLinkedList {
    public boolean isIntersect(Node h1, Node h2) {
        if (h1 == null || h2 == null) return false;
        Node tail1 = h1;
        //找h1最后一个结点
        while (tail1.next != null) tail1 = tail1.next;
        Node tail2 = h2;
        //找h2最后一个结点
        while (tail2.next != null) tail2 = tail2.next;
        return tail1 == tail2;
    }

    public Node findFirstMeetNode(Node h1, Node h2) {
        if (h1 == null || h2 == null) return null;
        Node tail1 = h1;
        int len1 = 1;
        //找h1最后一个结点
        while (tail1.next != null) {
            tail1 = tail1.next;
            len1++;
        }
        Node tail2 = h2;
        int len2 = 1;
        //找h2最后一个结点
        while (tail2.next != null) {
            tail2 = tail2.next;
            len2++;
        }

        if (tail1 != tail2) return null;

        Node t1 = h1;
        Node t2 = h2;
        if (len1 > len2) {
            int d = len1 - len2;
            while (d != 0) {
                t1 = t1.next;
                d--;
            }
        } else {
            int d = len2 - len1;
            while (d != 0) {
                t2 = t2.next;
                d--;
            }
        }

        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }

}
