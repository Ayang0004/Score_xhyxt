package com.xhyxt.Utils;

public class CheckString {

    private CheckString(){}
    /**
     * 判断字符串是否为空(null 或者 "")
     * @param str
     * @return true 表示字符串为空
     */
    public static boolean isNull(String str){
        boolean res = str == null || "".equals(str);
        return res;
    }
}
