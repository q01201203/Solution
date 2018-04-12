/**
 * Created by Administrator on 2018/4/11.
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Solution15 {

    /*public ListNode ReverseList(ListNode head) {
        while (head != null){
            ListNode p = head;
            ListNode q = p.next;

            if (q.next == null){
                q.next = p;
            }
        }
        return new ListNode(1);
    }*/

    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode reversedHead = null;
        ListNode current = head;
        ListNode tmp = null;
        ListNode pre = null;
        while (current != null) {
            tmp = current.next;
            current.next = pre;
            if (tmp == null)
                reversedHead = current;
            pre = current;
            current = tmp;

        }
        return reversedHead;
    }
}
