package leetcode.Easy.Array;

/**
 * Created by tiejin on 7/25/2018.
 */
//两数之和
//        给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
//
//        你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
//
//        示例:
//
//        给定 nums = [2, 7, 11, 15], target = 9
//
//        因为 nums[0] + nums[1] = 2 + 7 = 9
//        所以返回 [0, 1]
public class Array29 {
    private static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[]{0,0};
        boolean found=false;
        for(int i=0;i<nums.length&&!found;i++){
            int temp = target-nums[i];
                for(int j = i+1;j<nums.length;j++){
                    if(temp==nums[j]){
                        System.out.print(nums[i]+ ""+",");
                        System.out.print(nums[j]+ ""+ "\n");
                        ans[0]=i;
                        ans[1]=j;
                        found=true;
                        break;
                    }
                }

        }
        return ans;

    }
    public static void main(String[] args){
        int[] arr = new int[]{2,7,11,15};
        int target = 9;
        int[] ans = twoSum(arr, target);
        System.out.print(ans[0]+ "" + "," + ans[1] + "");
    }
}


// 利用hashmap
//public int[] twoSum(int[] nums, int target) {
//    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
//    int[] res = new int[2];
//    for (int i = 0; i < nums.length; ++i) {
//        m.put(nums[i], i);
//    }
//    for (int i = 0; i < nums.length; ++i) {
//        int t = target - nums[i];
//        if (m.containsKey(t) && m.get(t) != i) {
//            res[0] = i;
//            res[1] = m.get(t);
//            break;
//        }
//    }
//    return res;
//}