package leetcode.Easy.String;

/**
 * Created by tiejin on 7/30/2018.
 */

//验证回文字符串
//        给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//
//        说明：本题中，我们将空字符串定义为有效的回文串。
//
//        示例 1:
//
//        输入: "A man, a plan, a canal: Panama"
//        输出: true
//        示例 2:
//
//        输入: "race a car"
//        输出: false
public class String36 {
    private static boolean isPalindrome(String s) {
        if(s == null || s.length()==0){
            return true;
        }
        s = s.toLowerCase();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z' )||(s.charAt(i)>='0'&&s.charAt(i)<='9'))
                result.append(s.charAt(i));
        }
        if(result.length()==0){
            return true;
        }
        int st = 0;
        int end = result.length()-1;
        while(st < end){
            if(result.charAt(st)!=result.charAt(end))
                return false;
            else{
                st++;
                end--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
        boolean ans = isPalindrome(s);
        System.out.print(ans);
    }
}
