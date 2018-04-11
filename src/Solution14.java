/**
 * Created by Administrator on 2018/4/4.
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class Solution14 {
    /*public ListNode FindKthToTail(ListNode head, int k) {
        if (k == 0 || head == null) {
            return null;
        }
        ListNode kNode = head.next;
        for (int i = 1; i < k; i++) {
            if (kNode == null) {
                return null;
            }
            kNode = kNode.next;
        }
        int p = 0;
        while (kNode != null) {
            kNode = kNode.next;
            p++;
        }
        for (int i = 0; i < p; i++) {
            head = head.next;
        }
        return head;
    }*/


    public ListNode FindKthToTail(ListNode head, int k) { //5,{1,2,3,4,5}
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++) {
            if (i >= k)
                q = q.next;
            p = p.next;
        }
        return i < k ? null : q;
    }
}

