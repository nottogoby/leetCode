package com.leetCode.array.simple;

import com.leetCode.utils.PrintUtils;

import java.util.Arrays;
import java.util.List;

/**
 * 删除数组中指定的元素
 */
public class DeleteElementFromArray {

    public static void deleteElementFromArray(int[] array, int element){
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != element) {
                array[i] = array[j];
                i++;
            }
        }
        System.out.println(i);
        PrintUtils.printIntArrays(array);
    }

    public static void main(String[] args) {
        int[] array = new int[]{0,1,2,3,4,5};
        deleteElementFromArray(array,3);
    }

}
