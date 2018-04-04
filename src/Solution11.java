/**
 * Created by Administrator on 2018/4/2.
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution11 {

    public int NumberOf1(int n) {
        int count = 0,loop = 0;
        boolean flag;
        boolean first = true;
        if (n>=0){
            flag = true;
        }else {
            flag = false;
            n = -n;
        }
        while (n>0){
            int before = n;
            n >>= 1;
            if (n<<1 != before){
                count++;
            }else {
                if (first && !flag){
                    count++;
                }
            }
            first = false;
            loop ++;
        }
        if (!flag && loop != 31){
            count = count + 32 - loop;
        }else {
            count = 1;
        }
        return count;
    }
}
