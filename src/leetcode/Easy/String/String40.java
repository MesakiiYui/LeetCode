package leetcode.Easy.String;

/**
 * Created by tiejin on 8/3/2018.
 */
//最长公共前缀
//        编写一个函数来查找字符串数组中的最长公共前缀。
//
//        如果不存在公共前缀，返回空字符串 ""。
//
//        示例 1:
//
//        输入: ["flower","flow","flight"]
//        输出: "fl"
//        示例 2:
//
//        输入: ["dog","racecar","car"]
//        输出: ""
//        解释: 输入不存在公共前缀。
//        说明:
//
//        所有输入只包含小写字母 a-z 。
public class String40 {
    static int getint(String[] strs) {
        if(strs.length==0)return 0;
        if(strs.length==1)return strs[0].length();
        int minLen = strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen){
                minLen = strs[i].length();
            }
        }
        int count = 0;
        while(count < minLen){
            char strNow=strs[0].charAt(count);
            for(int j=0;j<strs.length;j++){
                if(strNow!=strs[j].charAt(count)){
                    System.out.println(strNow+"!="+strs[j]);
                    return count;
                }
            }
            count++;
        }
        return count;

    }

    static String longestCommonPrefix(String[] strs){
        int ans = getint(strs);
        System.out.println("ansint:"+ ans);
        if(ans==0)return "";
        return strs[0].substring(0,ans);
    }

    public static void main(String[] args){
        String[] inStrArr = new String[]{"c","c"};
        String ans = longestCommonPrefix(inStrArr);
        System.out.println("ans:"+ans);
    }
}
