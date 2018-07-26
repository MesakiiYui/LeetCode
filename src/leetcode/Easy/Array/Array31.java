package leetcode.Easy.Array;

/**
 * Created by tiejin on 7/26/2018.
 */

//旋转图像
//        给定一个 n × n 的二维矩阵表示一个图像。
//
//        将图像顺时针旋转 90 度。
//
//        说明：
//
//        你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
//
//        示例 1:
//
//        给定 matrix =
//        [
//        [1,2,3],
//        [4,5,6],
//        [7,8,9]
//        ],
//
//        原地旋转输入矩阵，使其变为:
//        [
//        [7,4,1],
//        [8,5,2],
//        [9,6,3]
//        ]
//        示例 2:
//
//        给定 matrix =
//        [
//        [ 5, 1, 9,11],
//        [ 2, 4, 8,10],
//        [13, 3, 6, 7],
//        [15,14,12,16]
//        ],
//
//        原地旋转输入矩阵，使其变为:
//        [
//        [15,13, 2, 5],
//        [14, 3, 4, 1],
//        [12, 6, 8, 9],
//        [16, 7,10,11]
//        ]
public class Array31 {
    private static void rotate(int[][] matrix) {
        //采用的方式是先按照副对角线翻折，然后再上下翻折
        int n = matrix.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if((i + j) >= n -1){
                    break;
                }
                int temp = matrix[n - 1 - j][ n - 1 - i];
                matrix[n - 1 - j][ n - 1 - i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        for(int i = 0; i < n / 2; i++){
            for(int j = 0; j < n; j++){
                int temp = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[][] arr = new int[][]{
        {15, 13, 2, 5},
        {14, 3, 4, 1},
        {12, 6, 8, 9},
        {16, 7, 10,11} 
        };
        rotate(arr);
        for (int[] arrEach:arr) {
            for (int elem:arrEach) {
                System.out.print(elem + " " + ",");
            }
            System.out.print("\n");
        }
    }
}
