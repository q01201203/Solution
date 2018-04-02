/**
 * Created by Administrator on 2018/3/30.
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution9 {
    public int JumpFloorII(int target) {
        int count=1;
        int f = target -1;
        for(int i=0;i<f;i++){
            count *= 2;
        }
        return count;
    }
}
