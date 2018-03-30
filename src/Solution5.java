import java.util.Stack;

/**
 * Created by Administrator on 2018/3/29.
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Solution5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        int stack2size = stack2.size();
        for (int i = 0;i<stack2size;i++){
            int n1 = stack2.pop();
            stack1.push(n1);
        }
        stack1.push(node);
        int stack1size = stack1.size();
        for (int i = 0;i<stack1size;i++){
            int n2 = stack1.pop();
            stack2.push(n2);
        }
    }

    public int pop() {
        if (stack2.isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        return stack2.pop();
    }
}
