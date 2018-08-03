package leetcode.Easy.String;

/**
 * Created by tiejin on 8/3/2018.
 */

//报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
//
//        1.     1
//        2.     11
//        3.     21
//        4.     1211
//        5.     111221
//        1 被读作  "one 1"  ("一个一") , 即 11。
//        11 被读作 "two 1s" ("两个一"）, 即 21。
//        21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
//
//        给定一个正整数 n ，输出报数序列的第 n 项。
//
//        注意：整数顺序将表示为一个字符串。
//
//        示例 1:
//
//        输入: 1
//        输出: "1"
//        示例 2:
//
//        输入: 4
//        输出: "1211"
public class String39 {
    static String countAndSay(int n) {
        if (n <= 0) return "-1";

        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            int index = 0;
            while (index < result.length()) {
                // 记录值
                char val = result.charAt(index);
                // 记录连续位数
                int count = 0;

                // 查找连续位数，碰到不相同的数字时停止。
                while (index < result.length() && result.charAt(index) == val) {
                    index++;
                    count++;
                }

                // 追加连续位数到结果中
                builder.append(String.valueOf(count));
                // 追加连续位数的值到结果中
                builder.append(val);
            }
            result = builder.toString();
        }
        return result;
    }


    public static void main(String[] args){
        String ans = countAndSay(7);
        System.out.print("ans:"+ans);
    }
}
