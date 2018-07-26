package leetcode.Easy.Array;

/**
 * Created by tiejin on 7/24/2018.
 */

//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//
//        不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
public class Array21 {
    private static int[] removeDuplicates(int[] nums) {
        for(int i = 0; i < (nums.length-1); i++)
        {
            if(nums[i] == nums[i+1]){
                int temp = nums[i];
                for(int j = i; j < (nums.length-1); j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = temp;
            }
        }
        return nums;
    };
    public static void  main(String[] args){
        int[] arr= new int[]{1,2,2,4,5,6,6,7};
        int[] result = removeDuplicates(arr);
        for (int i: result) {
            System.out.println(i);
        }
    }
}

//这道题的思路就是采用两个标记点 number 和 i ，number记录不重复元素的位置，
// i从number的下一个开始遍历数组，如果i位置的数字等于number位置的数字，说明该数字重复出现，不予处理；
// 如果i位置的数字不等于number位置的数字，说明该数字没有重复，需要放到l的下一位置，并使number加1。

//int number = 0;
//for(int i =0; i<nums.length;i++){
//        // 相邻两个值比较，不同才做统计操作
//        if(nums[i]!=nums[number]){
//        number++;
//        nums[number] = nums[i];
//        }
//        }
//// 不同数字为总量= number+1
//        return ++number;
