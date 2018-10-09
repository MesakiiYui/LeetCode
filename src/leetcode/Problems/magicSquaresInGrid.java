package leetcode.Problems;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by tiejin on 8/29/2018.
 */

//3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
//
//给定一个由整数组成的 N × N 矩阵，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。
//示例 1:
//
//        输入: [[4,3,8,4],
//             [9,5,1,9],
//             [2,7,6,2]]
//        输出: 1
//        解释:
//        下面的子矩阵是一个 3 x 3 的幻方：
//        438
//        951
//        276
//
//        而这一个不是：
//        384
//        519
//        762
//
//        总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。
//        提示:
//
//        1 <= grid.length = grid[0].length <= 10
//        0 <= grid[i][j] <= 15
    // https://leetcode-cn.com/problems/magic-squares-in-grid/description/
public class magicSquaresInGrid {
    private static int validGrid(int[][] arr) {
        final int row = arr.length;
        final int col = arr[0].length;
        System.out.println("row, col"+row+","+col);
        int count = 0;
        for(int i = 1; i < (row - 1); i=i+1 ){
            for(int j = 1; j < (col - 1); j=j+1) {
                System.out.println("arr[i][j]"+ arr[i][j]);
                if(arr[i][j]!=5){
                    continue;
                }
                int row1 = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];
                if(row1!=15) {
                    continue;
                }
                Set<Integer> arrSet = new TreeSet<>();
                arrSet.add(arr[i-1][j-1]);
                arrSet.add(arr[i-1][j]);
                arrSet.add(arr[i-1][j+1]);
                arrSet.add(arr[i][j-1]);
                arrSet.add(arr[i][j]);
                arrSet.add(arr[i][j+1]);
                arrSet.add(arr[i+1][j-1]);
                arrSet.add(arr[i+1][j]);
                arrSet.add(arr[i+1][j+1]);
                if(arrSet.size()!=9){
                    continue;
                }
                boolean cheakFlag = false;
                for(int each : arrSet){
                    if(each>9 || each <0){
                        cheakFlag = true;
                        break;
                    }
                }
                if(cheakFlag){
                    continue;
                }



                int row2 = arr[i][j-1] + arr[i][j] + arr[i][j+1];
                int row3 = arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                int col1 = arr[i-1][j-1] + arr[i][j-1] + arr[i+1][j-1];
                int col2 = arr[i-1][j] + arr[i][j] + arr[i+1][j];
                int col3 = arr[i-1][j+1] + arr[i][j+1] + arr[i+1][j+1];
                int ltor = arr[i-1][j-1] + arr[i][j] + arr[i+1][j+1];
                int rtol = arr[i-1][j+1] + arr[i][j] + arr[i+1][j-1];
                if(row1 == row2 && row2 == row3 && row3 == col1 && col1 == col2 && col2 == col3 && col3 == ltor && ltor == rtol){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {4,3,8,4},
                {9,5,1,9},
                {2,7,6,2},
        };
        int[][] arr2 = new int[][]{
                {1,8,6},
                {10,5,0},
                {4,2,9},
        };
        int [][] arr3 = new int[][]{
                {3,10,2,3,4},
                {4,5,6,8,1},
                {8,8,1,6,8},
                {1,3,5,7,1},
                {9,4,9,2,9}
        };
        int ans = validGrid(arr3);
        System.out.println("ans:"+ans);

    }
}
