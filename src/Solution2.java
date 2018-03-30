/**
 * Created by Administrator on 2018/3/30.
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution2 {

    public String replaceSpace(StringBuffer str) {
        String str1 = str.toString();
        return str1.replaceAll(" ", "%20");
    }
}
