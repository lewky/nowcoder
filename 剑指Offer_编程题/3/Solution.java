/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/

/*
	题目：输入一个链表，从尾到头打印链表每个节点的值。
*/

/*
	解题思路：
	第一种方法是通过栈的后进先出来从尾到头遍历链表的值，
	第二种方法是直接递归，注意这里是在添加节点值之前进行的递归。
*/
import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode != null){
            this.printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}