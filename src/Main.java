import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.test20();
    }

    void test5() {
        Solution5 solution1 = new Solution5();
        solution1.push(1);
        solution1.push(2);
        solution1.push(3);
        System.out.println(solution1.pop());
        System.out.println(solution1.pop());
        System.out.println(solution1.pop());
    }

    void test6() {
        Solution6 solution6 = new Solution6();
        int[] array = {4, 5, 6, 6, 7, 7, 7, 1, 1, 1, 2, 2, 3};
        System.out.println(solution6.minNumberInRotateArray(array));
    }

    void test7() {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.Fibonacci(6));
    }

    void test8() {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.JumpFloor(6));
    }

    void test10() {
        Solution10 solution10 = new Solution10();
        System.out.println(solution10.RectCover(5));
    }

    void test11() {
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.NumberOf1(-2147483648));
    }

    void test12() {
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.Power(2, 0));

    }

    void test13() {
        Solution13 solution13 = new Solution13();
        int[] origin = new int[]{1, 2, 3, 5, 4, 7};
        solution13.reOrderArray(origin);
        for (int i : origin) {
            System.out.println(i);
        }
    }

    void test14() {
        Solution14 solution14 = new Solution14();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = solution14.FindKthToTail(listNode1, 4);
        if (listNode != null) {
            System.out.println(listNode.val);
        }
    }

    void test16() {
        Solution16 solution16 = new Solution16();
        ListNode listNode1_1 = new ListNode(1);
        ListNode listNode1_2 = new ListNode(3);
        ListNode listNode1_3 = new ListNode(4);
        listNode1_1.next = listNode1_2;
        listNode1_2.next = listNode1_3;
        ListNode listNode2_1 = new ListNode(2);
        ListNode listNode2_2 = new ListNode(3);
        ListNode listNode2_3 = new ListNode(5);
        listNode2_1.next = listNode2_2;
        listNode2_2.next = listNode2_3;
        ListNode listNode = solution16.Merge(listNode1_1, listNode2_1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    void test17() {
        TreeNode treeNode1 = new TreeNode(8);
        TreeNode treeNode2 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(10);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(9);
        TreeNode treeNode7 = new TreeNode(11);
        treeNode1.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        TreeNode treeNode_1 = new TreeNode(10);
        TreeNode treeNode_2 = new TreeNode(9);
        TreeNode treeNode_3 = new TreeNode(11);
        treeNode_1.left = treeNode_2;
        treeNode_1.right = treeNode_3;
        Solution17 solution17 = new Solution17();
        System.out.println(solution17.HasSubtree(treeNode1,treeNode_1));
    }

    void test18(){
        TreeNode treeNode1 = new TreeNode(8);
        TreeNode treeNode2 = new TreeNode(6);
        TreeNode treeNode3 = new TreeNode(10);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(7);
        TreeNode treeNode6 = new TreeNode(9);
        TreeNode treeNode7 = new TreeNode(11);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        Solution18 solution18 = new Solution18();
        solution18.Mirror(treeNode1);
    }

    void test19(){
        Solution19 solution19 = new Solution19();
        ArrayList<Integer> arrayList = solution19.printMatrix(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    void test20(){
        Solution20 solution20 = new Solution20();
        solution20.push(3);
        System.out.println(solution20.min());
        solution20.push(4);
        System.out.println(solution20.min());
        solution20.push(2);
        System.out.println(solution20.min());
        solution20.push(3);
        System.out.println(solution20.min());
        solution20.pop();
        System.out.println(solution20.min());
        solution20.pop();
        System.out.println(solution20.min());
        solution20.push(0);
        System.out.println(solution20.min());
    }
}



