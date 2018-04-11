/**
 * Created by Administrator on 2018/4/3.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution13 {

    public void reOrderArray(int [] array) {
        if (array == null) {
            return;
        }

        int j=0; //记录偶数的坐标
        boolean first = true; //第一个偶数坐标
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0 && first){
                j = i;
                first = false;
            }else if(array[i]%2 == 1){
                while (i>j){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    i--;
                }
                j++;
            }
        }
    }

    /*public void reOrderArray(int[] array) {
        if (array == null) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            //int temp=array[i];
            if (array[i] % 2 == 1) {
                int temp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] % 2 == 0) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = temp;
            }
        }
    }*/

}
