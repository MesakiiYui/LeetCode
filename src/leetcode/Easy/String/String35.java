package leetcode.Easy.String;

import java.util.HashMap;

/**
 * Created by tiejin on 7/27/2018.
 */

//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
//
//        示例 1:
//
//        输入: s = "anagram", t = "nagaram"
//        输出: true
//        示例 2:
//
//        输入: s = "rat", t = "car"
//        输出: false
//        说明:
//        你可以假设字符串只包含小写字母。
//
//        进阶:
//        如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？

public class String35 {
    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int len = s.length();
        HashMap<String, Integer> hmap = new HashMap<>();
        for(int i = 0; i < len; i++){
            String elem = s.substring(i, i+1);
            if(hmap.containsKey(elem)){
                int old = hmap.get(elem);
                hmap.replace(elem, old, old+1);
            } else {
                hmap.put(elem, 1);
            }
        }
        for(int j = 0; j < len; j++){
            String elemT = t.substring(j, j+1);
            if(hmap.containsKey(elemT)){
                int old = hmap.get(elemT);
                hmap.replace(elemT, old, old -1);
                if(hmap.get(elemT)<0){
                    return false;
                }
            }
                else{
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){
        String s = "anagramgjcrx";
        String t = "nagaramjgrcx";
        boolean ans = isAnagram(s,t);
        System.out.print("ans" + " " + ans);
    }
}


//1.新建，Map<String,List<String>>
//
//        2.遍历字符串数组里的每个字符串
//
//        把每个字符串---》字符数组，并对其进行排序
//
//        排序后的字符数组--》字符串，作为key，去查找并添加进Map<String,List<String>>
//
//        3.最后，输出Map<String,List<String>> 里的所有的value
//
//public List<List<String>> groupAnagrams(String[] strs) {
//        if (strs == null || strs.length == 0) return  new ArrayList<List<String>>();
//
//        Map<String,List<String>> map = new HashMap<String, List<String>>();
//        for (String s:strs){
//        char[] ca = s.toCharArray();
//        Arrays.sort(ca);        //从小到大排序
//        String keyStr = String.valueOf(ca);
//        if (!map.containsKey(keyStr)){
//        map.put(keyStr,new ArrayList<String>());
//        }
//        map.get(keyStr).add(s);
//        }
//
//        return  new ArrayList<List<String>>(map.values());
//        }