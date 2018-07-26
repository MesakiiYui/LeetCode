package leetcode.Easy.Array;

/**
 * Created by tiejin on 7/25/2018.
 */
//加一
//        给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
//
//        最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
//
//        你可以假设除了整数 0 之外，这个整数不会以零开头。
public class Array27 {
    private static int[] plusOne(int[] digits) {

        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry == 0) {
                return digits;
            }
            int tmp = digits[i] + carry;
            carry = tmp / 10;
            digits[i] = tmp % 10;
        }

        if (carry != 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
    public static void main(String[] args){
        int[] arr = new int[]{9,9,9,9,9,9,9};
        int[] ans = plusOne(arr);
        for(int i : ans){
            System.out.print(i + " " + ",");
        }
    }
}
