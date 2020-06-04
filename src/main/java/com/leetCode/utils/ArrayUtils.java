package com.leetCode.utils;

public class ArrayUtils {

    public static int[] sort(int[] array, String sortType){
        if (array == null || array.length == 0){
            PrintUtils.printError("array is empty");
        }
        switch (sortType){
            case "quick":
                return quickSort(array);

        }
        return null;
    }

    private static int[] quickSort(int[] array) {
        return new int[0];
    }


}
