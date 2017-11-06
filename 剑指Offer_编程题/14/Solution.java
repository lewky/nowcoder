/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/*
	题目：输入一个链表，输出该链表中倒数第k个结点。
*/

/*
	思路：让A结点和B结点都指向head，接着A结点先遍历到第K个结点，
	之后，A结点和B结点同时开始往下遍历，直到A结点遍历到最后一个
	结点，此时B结点正是倒数第K个结点。
*/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode nodeA = head;
        ListNode nodeB = head;
        int count = 1;
        for (int i = 0; i < k - 1; i++) {
            nodeA = nodeA.next;
            count++;
        }
        while (nodeA.next != null) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
            count++;
        }
        if (k > count) {
            return null;
        }
        return nodeB;
    }
}