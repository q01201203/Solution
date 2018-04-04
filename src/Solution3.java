import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/30.
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class Solution3 {

    ArrayList<Integer> rs = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode.next == null) {
            rs.add(listNode.val);
            return rs;
        }
        rs.add(listNode.val);
        return printListFromTailToHead(listNode.next);
    }

    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        if (listNode==null){
            return rs;
        }
        if (listNode.next!=null){
            printListFromTailToHead3(listNode.next);
        }else {
            rs.add(listNode.val);
            return rs;
        }
        rs.add(listNode.val);
        return rs;
    }

    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHead2(listNode.next);
            rs.add(listNode.val);
        }
        return rs;
    }
}
