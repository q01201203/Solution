import java.util.ArrayList;

/**
 * Created by Administrator on 2018/4/13.
 * 从上往下打印二叉树
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution22 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
