package leetcode;

/**
 * Created by tiejin on 7/25/2018.
 */

// 移动零
//         给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//         示例:
//
//         输入: [0,1,0,3,12]
//         输出: [1,3,12,0,0]
//         说明:
//
//         必须在原数组上操作，不能拷贝额外的数组。
//         尽量减少操作次数。
public class Array28 {
    private static void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                count++;
                for(int j = i;j<nums.length-1;j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1]=0;
                i--;
            }
            if(i+count+1==nums.length){
                break;
            }

            for(int j : nums){
                System.out.print(j + " " + ",");
            }
            System.out.print("\n");

        }

    }
    public static void main(String[] args){
        int[] arr = new int[]{0,0,0,2,0,0,3,5,0,8};
        moveZeroes(arr);
        for(int i : arr){
            System.out.print(i + " " + ",");
        }
    }
}


//思路很简单，使用使用两个索引lastIndex和curIndex，curIndex从后向前遍历直到其元素为0，然后根据lastIndex与curIndex之间的差值，将元素前移。

//    public void moveZeroes(int[] nums) {
//        int curIndex = nums.length - 1;
//        int lastIndex = nums.length - 1;
//        int count = 0;
//        while (curIndex >= 0) {
//            if (nums[curIndex] == 0) {
//                count = lastIndex - curIndex;
//                for (int i = 0; i < count; i++) {
//                    nums[curIndex + i] = nums[curIndex + i + 1];
//                }
//                nums[lastIndex] = 0;
//                lastIndex--;
//            }
//            curIndex--;
//        }
//    }