package com.leetCode.array.simple;

/**
 * @author liu.chaobing
 * 给定整数数组和一个目标值，找出数组中和为目标值的两个数
 */
public class TwoSumInArray {

    /**
     *
     * @param array 目标数组
     * @param sum 目标值
     */
    public static void twoSum(int[] array, int sum){
        if(array != null && array.length != 0){
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == sum){
                        System.out.println("arrayNum:"+array[i]+","+array[j]);
                    }
                }
            }
        }else System.out.println("array is null or empty");
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};                                         
        int sum = 9;
        twoSum(array,sum);
    }

}
