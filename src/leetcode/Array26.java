package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tiejin on 7/25/2018.
 */

//给定两个数组，写一个方法来计算它们的交集。
//
//        例如:
//        给定 nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
//
//        注意：
//
//        输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
//        我们可以不考虑输出结果的顺序。
//        跟进:
//
//        如果给定的数组已经排好序呢？你将如何优化你的算法？
//        如果 nums1 的大小比 nums2 小很多，哪种方法更优？
//        如果nums2的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
public class Array26 {
    private static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> tmp = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums1.length; i++) {
            Integer value = map.get(nums1[i]);
            map.put(nums1[i], (value == null ? 0 : value) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
                tmp.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] result = new int[tmp.size()];
        int i = 0;
        for (Integer e : tmp)
            result[i++] = e;
        return result;

    }
    public static void main(String[] args){

        int[] arr1 = new int[]{1, 2, 2, 1};
        int[] arr2 = new int[]{2,2};
        int[] ans = intersect(arr1, arr2);
        for(int i : ans) {
            System.out.print(i + " " + ",");
        }
    }
}
