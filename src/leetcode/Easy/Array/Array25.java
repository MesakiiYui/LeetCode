package leetcode.Easy.Array;

import java.util.Arrays;

/**
 * Created by tiejin on 7/25/2018.
 */
//只出现一次的数字
//        给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//        说明：
//
//        你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
public class Array25 {
    private static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1;){
            if(nums[i]==nums[i+1]){
                i = i + 2;
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,2,1,4,3,4};
        int ans = singleNumber(arr);
        System.out.print(ans);
    }
}


//分析
//        题中要求，线性时间复杂度，而且不使用额外空间，那么就要从数组本身入手，同时只循环扫描一遍数组
//
//        我们可以考虑 异或运算 ，它是满足交换律和结合的，也就是说 a^b^c = a^c^b，这样当我们遍历数组，顺次进行异或运算，那么最终的结果就是唯一的不重复数字。
//
//        如[4,1,2,1,2]，4^1^2^1^2 = 1^1^2^2^4 = 0^0^4=4
//
//        代码
//class Solution {
//    public int singleNumber(int[] nums) {
//        int result = 0;
//        for(int i = 0;i< nums.length;i++){
//            result = nums[i] ^ result;
//        }
//        return result;
//    }
//}