/**
 * Created by Administrator on 2018/3/30.
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * n<=39
 */
public class Solution7 {

    public int Fibonacci(int n) {
        int a1 = 0;
        int a2 = 1;
        for (;n>0;n--){
            int temp = a2;
            a2 = a1 + a2;
            a1 = temp;
        }
        return a1;
    }

    /*public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] record = new int[n + 1];
        record[0] = 0;
        record[1] = 1;
        for (int i = 2; i <= n; i++) {
            record[i] = record[i - 1] + record[i - 2];
        }
        return record[n];
    }*/

    /*public int Fibonacci(int n) {
        int f = 0, g = 1;
        while (n-- > 0) {
            g += f;
            f = g - f;
        }
        return f;
    }*/

    /*public int Fibonacci(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }*/
}
