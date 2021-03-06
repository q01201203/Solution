/**
 * Created by Administrator on 2018/3/30.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution1 {
    public boolean Find(int target, int [][] array) {
        int row = 0;
        int col = array[0].length-1;
        while(row<array.length&&col>=0){
            if(target>array[row][col]){
                row++;
            }else if(target<array[row][col]){
                col--;
            }else{
                return true;
            }
        }
        return false;
    }
}
