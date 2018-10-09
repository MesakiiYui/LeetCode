package leetcode.Problems;

/**
 * Created by tiejin on 8/31/2018.
 */

// https://leetcode-cn.com/problems/max-chunks-to-make-sorted/description/
// 数组arr是[0, 1, ..., arr.length - 1]的一种排列，我们将这个数组分割成几个“块”，并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
//    我们最多能将数组分成多少块？
//
//    示例 1:
//
//    输入: arr = [4,3,2,1,0]
//    输出: 1
//    解释:
//    将数组分成2块或者更多块，都无法得到所需的结果。
//    例如，分成 [4, 3], [2, 1, 0] 的结果是 [3, 4, 0, 1, 2]，这不是有序的数组。
//    示例 2:
//
//    输入: arr = [1,0,2,3,4]
//    输出: 4
//    解释:
//    我们可以把它分成两块，例如 [1, 0], [2, 3, 4]。
//    然而，分成 [1, 0], [2], [3], [4] 可以得到最多的块数。
//    注意:
//
//    arr 的长度在 [1, 10] 之间。
//    arr[i]是 [0, 1, ..., arr.length - 1]的一种排列。
public class maxChunksToMakeMorted {
    private static int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int count = 1;

        int leftMax = arr[0];
        int[] rightMin = new int[len];
        rightMin[len-1] = arr[len-1];

        for (int i = len - 2; i >= 0 ; i--) {
            rightMin[i] = Math.min(arr[i],rightMin[i+1]);
        }

        for (int i = 1; i < len; i++) {
            if (rightMin[i] >= leftMax){
                count++;
                leftMax = arr[i];
            }else {
                leftMax = Math.max(arr[i] , leftMax);
            }
        }

        return count;
    }
    public static void main(String[] args){

        int[] arr = new int[]{1,0,5,4,3,8,9};
        int ans = maxChunksToSorted(arr);
        System.out.println("ans"+ans);

    }

}
