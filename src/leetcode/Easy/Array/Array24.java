package leetcode.Easy.Array;

/**
 * Created by tiejin on 7/25/2018.
 */

//存在重复

//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

public class Array24 {
    private static boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] - nums[j] == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] srgs){
        int[] arr = new int[]{1, 3, 6, 7, 3};
        boolean ans = containsDuplicate(arr);
        System.out.print(ans);
    }
}


// 方法一 .先排序，后在遍历数组时每次与下一个做比较，若存在相等则存在重复

//public class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length-1; i++) {
//            if(nums[i] == nums[i+1]) {
//                return true;
//            }
//        }
//        return false;
//    }
//}

//方法二.利用HashSet的唯一性，在每次添加的时候检查返回值来进行判断
//为什么要用这种方法？
//虽然效率上和空间上都没有上面的方法好，但是这种可以适用于很多判断重复的问题，它不仅仅适用于基本数据类型，也可以用在判断对象的重复。可以说是种万精油的方法吧

//class Solution {
//    private Set save = new HashSet();
//    public boolean containsDuplicate(int[] nums) {
//        for(int a : nums){
//            //Set.add(Object)添加失败会返回false
//            if(!save.add(a))return true;
//        }
//        return false;
//    }
//}

// 为什么不在里面用Set.contains( )来进行判断呢？
// 因为这在每次插入时会浪费一次查询时间