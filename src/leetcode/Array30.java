package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by tiejin on 7/25/2018.
 */

//判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
//
//        数字 1-9 在每一行只能出现一次。
//        数字 1-9 在每一列只能出现一次。
//        数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
//
//
//        上图是一个部分填充的有效的数独。
//
//        数独部分空格内已填入了数字，空白格用 '.' 表示。
//
//        示例 1:
//
//        输入:
//        [
//        ["5","3",".",".","7",".",".",".","."],
//        ["6",".",".","1","9","5",".",".","."],
//        [".","9","8",".",".",".",".","6","."],
//        ["8",".",".",".","6",".",".",".","3"],
//        ["4",".",".","8",".","3",".",".","1"],
//        ["7",".",".",".","2",".",".",".","6"],
//        [".","6",".",".",".",".","2","8","."],
//        [".",".",".","4","1","9",".",".","5"],
//        [".",".",".",".","8",".",".","7","9"]
//        ]
//        输出: true
//        示例 2:
//
//        输入:
//        [
//        ["8","3",".",".","7",".",".",".","."],
//        ["6",".",".","1","9","5",".",".","."],
//        [".","9","8",".",".",".",".","6","."],
//        ["8",".",".",".","6",".",".",".","3"],
//        ["4",".",".","8",".","3",".",".","1"],
//        ["7",".",".",".","2",".",".",".","6"],
//        [".","6",".",".",".",".","2","8","."],
//        [".",".",".","4","1","9",".",".","5"],
//        [".",".",".",".","8",".",".","7","9"]
//        ]
//        输出: false
//        解释: 除了第一行的第一个数字从 5 改为 8 以外，空格内其他数字均与 示例1 相同。
//        但由于位于左上角的 3x3 宫内有两个 8 存在, 因此这个数独是无效的。
//        说明:
//
//        一个有效的数独（部分已被填充）不一定是可解的。
//        只需要根据以上规则，验证已经填入的数字是否有效即可。
//        给定数独序列只包含数字 1-9 和字符 '.' 。
//        给定数独永远是 9x9 形式的。
public class Array30 {
    private static int numValidate(char elem){
        switch (elem)
        {
            case '1':
                return 1;
                
            case '2':
                return 2;
                
            case '3':
                return 3;
                
            case '4':
                return 4;
                
            case '5':
                return 5;
                
            case '6':
                return 6;
                
            case '7':
                return 7;
                
            case '8':
                return 8;
                
            case '9':
                return 9;
                
            case '.':
                return 0;
                
            default:
                return -1;
        }

    }
    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> column = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // 检查第i行，在横坐标位置
                if (board[i][j] != '.' && !row.add(board[i][j]))
                    return false;
                // 检查第i列，在纵坐标位置
                if (board[j][i] != '.' && !column.add(board[j][i]))
                    return false;
                // 行号+偏移量
                int RowIndex = 3 * (i / 3) + j / 3;
                // 列号+偏移量
                int ColIndex = 3 * (i % 3) + j % 3;
                //每个小九宫格，总共9个
                if (board[RowIndex][ColIndex] != '.'
                        && !cube.add(board[RowIndex][ColIndex]))
                    return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        char[][] arr = new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','5','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        boolean ans = isValidSudoku(arr);
        System.out.print(ans);
    }
}
//位图法
//for (int i = 0; i < 9; i++) {
//        int[] bit_map_row = new int[9];
//        int[] bit_map_col = new int[9];
//        int[] bit_map_cube = new int[9];
//        // 注意值减去1，下标从0开始
//        for (int j = 0; j < 9; j++) {
//        if (board[i][j] != '.')
//        if (bit_map_row[board[i][j] - '1'] == 1)
//        return false;
//        else
//        bit_map_row[board[i][j] - '1'] = 1;
//        if (board[j][i] != '.')
//        if (bit_map_col[board[j][i] - '1'] == 1)
//        return false;
//        else
//        bit_map_col[board[j][i] - '1'] = 1;
//        int RowIndex = 3 * (i / 3) + j / 3;
//        int ColIndex = 3 * (i % 3) + j % 3;
//        int val = board[RowIndex][ColIndex];
//        if (val != '.')
//        if (bit_map_cube[val - '1'] == 1)
//        return false;
//        else
//        bit_map_cube[val - '1'] = 1;
//        }
//        }
//        return true;
