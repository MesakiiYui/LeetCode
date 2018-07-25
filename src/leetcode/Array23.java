package leetcode;

import java.awt.*;

/**
 * Created by tiejin on 7/25/2018.
 */
// 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
public class Array23 {
    private static int[] rotate(int[] arr, int k){
        int count = 0;
        while(count<k){
            int temp = arr[arr.length-1];
            for(int i=arr.length-2;i>=0;i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            count++;
        }

        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arrCopy = arr;
        int k = 2;
        int[] newArr = rotate(arr, k);
        for (int i : newArr){
            System.out.print(i);
        }
        for (int j:arr){
            System.out.print(j);
        }
        for(int l:arr){
            System.out.print(l);
        }

    }
}

// 标准取巧的解法
//private static int[] Rotate1(int[] nums, int k)
//{
//    int[] result = new int[nums.Length];//根据nums数组长度生成和其一样长度的数组
//    for (int i = 0; i < nums.Length; i++)
//    {
//        result[(i + k) % nums.Length] = nums[i];//这里用到了取余，也是这个方法的核心
//    }
//    return result;
//}



///3元素在数组中的2位置上，(2+3) % 7 = 5
///5元素在数组中的4位置上，(4+3) % 7 = 0
///6元素在数组中的5位置上，(5+3) % 7 = 1
///7元素在数组中的6位置上，(6+3) % 7 = 2


//长度为7的数组，向右旋转3步，数字的位置加3之后大于7的都要再从0号位置重新开始计算剩余的步子。这点特性就可以很好的用到求余。
