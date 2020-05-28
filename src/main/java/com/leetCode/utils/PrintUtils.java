package com.leetCode.utils;

/**
 * 输出工具类
 */
public class PrintUtils {

    public static void printIntArrays(int[] objects){
        if (objects == null || objects.length < 1)
            System.out.println("Object[] is null or empty!");
        else {
            StringBuffer buffer = new StringBuffer("[");
            for (int i = 0; i < objects.length; i++) {
                buffer.append(StringUtils.parseStr(objects[i]));
                if (i != objects.length - 1)
                buffer.append(",");
            }
            buffer.append("]");
            System.out.println("Array:"+buffer.toString());
        }
    }

}
