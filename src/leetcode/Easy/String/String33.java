package leetcode.Easy.String;


/**
 * Created by tiejin on 7/27/2018.
 */

//
//给定一个 32 位有符号整数，将整数中的数字进行反转。
//
//        示例 1:
//
//        输入: 123
//        输出: 321
//        示例 2:
//
//        输入: -123
//        输出: -321
//        示例 3:
//
//        输入: 120
//        输出: 21
//        注意:
//
//        假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。


public class String33 {
    private static int reverse(int x) {
        int i=0;

        while (x!=0)
        {
            int n=i*10+x%10;
            x=x/10;
            if(n/10!=i)return 0;
            i=n;
        }
        return i;
    }
    public static void main(String[] args){
        int num = 16527;
        int ans = reverse(num);
        System.out.print(ans);
    }
}
