/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

/*
	题目：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
*/

/*
	思路：可以用迭代或者递归的方式来解，一般能够用迭代解决的就尽量不要用递归。
*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode target = null;
        ListNode head = null;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val >= list2.val) {
            head = list2;
            target = list2;
            list2 = list2.next;
        } else {
            head = list1;
            target = list1;
            list1 = list1.next;
        }
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                target.next = list2;
                list2 = list2.next;
            } else {
                target.next = list1;
                list1 = list1.next;
            }
            target = target.next;
        }
        if (list1 == null) {
            target.next = list2;
        }
        if (list2 == null) {
            target.next = list1;
        }
        return head;
    }
}