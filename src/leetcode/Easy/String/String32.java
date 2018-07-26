package leetcode.Easy.String;

/**
 * Created by tiejin on 7/26/2018.
 */
//请编写一个函数，其功能是将输入的字符串反转过来。
//
//        示例：
//
//        输入：s = "hello"
//        返回："olleh"
public class String32 {
    private static String reverseString(String s) {
        char[] arr = s.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            newStr.append(arr[i]);
        }
        return (newStr+ "");
    }
    public static void main(String[] args){
        String str = "abcdefg";
        String newStr = reverseString(str);
        System.out.print(newStr);
    }

}
