/**
 * Created by Administrator on 2018/4/2.
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Solution10 {

    public int RectCover(int target) {
        if (target == 0){
            return 0;
        }else if (target == 1){
            return 1;
        }
        int i = 1,j = 1;
        for (;target>1;target--){
            j = i + j;
            i = j - i;
        }
        return j;
    }
}
