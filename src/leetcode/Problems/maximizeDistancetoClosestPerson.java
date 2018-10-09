package leetcode.Problems;

/**
 * Created by tiejin on 9/13/2018.
 */
//在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
//
//        至少有一个空座位，且至少有一人坐在座位上。
//
//        亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
//
//        返回他到离他最近的人的最大距离。
//
//        示例 1：
//
//        输入：[1,0,0,0,1,0,1]
//        输出：2
//        解释：
//        如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
//        如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
//        因此，他到离他最近的人的最大距离是 2 。
//        示例 2：
//
//        输入：[1,0,0,0]
//        输出：3
//        解释：
//        如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
//        这是可能的最大距离，所以答案是 3 。
//        提示：
//
//        1 <= seats.length <= 20000
//        seats 中只含有 0 和 1，至少有一个 0，且至少有一个 1。
public class maximizeDistancetoClosestPerson {
    private static int maxDistToClosest(int[] seats) {
        // 最近的距离
        // 数连续的0构成的队列，记住最长的队列的开始和结束的地址
        // 如果该队列在最开头， 即lIndex=0，那么最大的长度就是该队列的长度，rIndex=seats.length-1时原理也相同
        // 如果该队列在中间，那么，最大的距离就是队列长度的一半1=>1;2=>1;3=>2;4>2;5=>3;(i+1)/2
        int lIndex = 0;
        int rIndex = 0;
        int i = 0;
        while (i < seats.length){
            int lIndexTemp = i;
            int rIndexTemp = i;

        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,0,0,1,0,1};
        int ans = maxDistToClosest(arr);
        System.out.println("ans is "+ ans);
    }
}
