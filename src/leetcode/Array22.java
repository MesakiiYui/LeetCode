package leetcode;

/**
 * Created by tiejin on 7/24/2018.
 */

//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
//注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
public class Array22 {
    private static int getMostMoney(int[] arr){
        int moneyTotal = 0;
        for(int i = 0; i < arr.length-1; i++){
            int moneyTemp = 0;
            if(arr[i]<arr[i+1]){
                moneyTemp = arr[i+1] - arr[i];
                moneyTotal = moneyTotal + moneyTemp;
            }
        }
        return moneyTotal;
    }
    public static void  main(String[] args){
        int[] arr = new int[]{7,6,4,8,1};
        int total = getMostMoney(arr);
        System.out.println(total);
    }
}


//不小心用到了贪心算法，写的很对