/**
 * Created by Administrator on 2018/4/3.
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution12 {

    public double Power(double base, int exponent) {
        double result = base;
        boolean symbol;
        if (exponent>0){
            symbol = true;//正数
        }else if (exponent<0){
            if (base == 0){
                throw new IllegalArgumentException("指数不能为0");
            }
            exponent = -exponent;
            symbol = false;
        }else {
            return 1;
        }
        for (;exponent>1;exponent--){
             result *= base;
        }
        if (symbol){
            return result;
        }else {
            return 1/result;
        }
    }
}
