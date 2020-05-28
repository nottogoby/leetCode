package com.leetCode.utils;

import com.sun.istack.internal.NotNull;

public class StringUtils {

    public static String parseStr(@NotNull Object str){
        return str == null ? "" : str.toString();
    }

    public static void main(String[] args) {
        System.out.println(parseStr(null));
    }

}
