public class Main {

    public static void main(String[] args) {
        /*Solution5 solution1 = new Solution5();
        solution1.push(1);
        solution1.push(2);
        solution1.push(3);
        System.out.println(solution1.pop());
        System.out.println(solution1.pop());
        System.out.println(solution1.pop());*/

        /*Solution6 solution6 = new Solution6();
        int[] array= {4,5,6,6,7,7,7,1,1,1,2,2,3};
        System.out.println(solution6.minNumberInRotateArray(array));*/

        /*Solution7 solution7 = new Solution7();
        System.out.println(solution7.Fibonacci(6));*/

        /*Solution8 solution8 = new Solution8();
        System.out.println(solution8.JumpFloor(6));*/

        /*Solution10 solution10 = new Solution10();
        System.out.println(solution10.RectCover(5));*/

        /*Solution11 solution11 = new Solution11();
        System.out.println(solution11.NumberOf1(-2147483648));*/

        /*Solution12 solution12 = new Solution12();
        System.out.println(solution12.Power(2,0));*/

        /*Solution13 solution13 = new Solution13();
        int[] origin = new int[]{1,2,3,5,4,7};
        solution13.reOrderArray(origin);
        for (int i : origin) {
            System.out.println(i);
        }*/

        /*Solution14 solution14 = new Solution14();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        ListNode listNode = solution14.FindKthToTail(listNode1,4);
        if (listNode!=null){
            System.out.println(listNode.val);
        }*/

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
        ListNode listNode = solution16.Merge(listNode1_1,listNode2_1);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}



