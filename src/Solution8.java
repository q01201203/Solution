/**
 * Created by Administrator on 2018/3/30.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution8 {

    int count = 0; //跳法

    public int JumpFloor(int target) {
        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        int f = 1, g = 2;
        while (target-- > 2) {
            g += f;
            f = g - f;
        }
        return g;
    }

    /*public int JumpFloor(int target) {
        canJump(target);
        return count;
    }*/

    void canJump(int start){
        if (start - 2 == 0){
            count++;
        }else if (start - 2>0){
            canJump(start - 2);
        }
        if (start - 1 == 0){
            count++;
        }else if (start - 1>0){
            canJump(start - 1);
        }
    }

}


