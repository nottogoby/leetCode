package com.leetCode.array.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 删除排序数组中的重复项
 * @author liu.chaobing
 */
public class DeleteRepeatArray {

    /**
     * 给定一个排序数组，删除重复出现的元素，使每个元素只保留一个，返回整理后的数组
     * @param array
     * @return
     */
    public static int[] deleteRepeatArray(int[] array){
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            integers.add(array[i]);
        }
        Object[] objects = integers.toArray();
        System.out.println(Arrays.asList(objects));
        return null;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,3,3,3,4,4,4,4};
        int[] ints = deleteRepeatArray(array);
    }

}
