package leetcode.Easy.String;

import java.util.*;

/**
 * Created by tiejin on 7/27/2018.
 */

//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
//        案例:
//
//        s = "leetcode"
//        返回 0.
//
//        s = "loveleetcode",
//        返回 2.


public class String34 {
    private static int firstUniqChar(String s) {
        int[] checkTool = new int[s.length()];
        HashMap<String, Integer> hmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String elem = s.substring(i,i+1);
            if(hmap.containsKey(elem)){
                checkTool[hmap.get(elem)] = -1;
                checkTool[i] = -1;
            }else {
                hmap.put(elem, i);
                checkTool[i] = 1;
            }

        }
        for(int i = 0; i < checkTool.length;i++)
        {
            if(checkTool[i] == 1){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        String s = "abcba";
        int ans = firstUniqChar(s);
        System.out.print("ans:" + ans);
    }
}
