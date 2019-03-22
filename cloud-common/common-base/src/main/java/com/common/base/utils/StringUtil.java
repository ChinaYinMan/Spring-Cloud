package com.common.base.utils;

/**
 * @description String工具类
 * @author mantou
 */
public class StringUtil {

    /**
     * 判断字符串是否为Empty
     * @param str
     * @return
     */
    public static Boolean isEmpty(String str) {
        if (isNull(str) || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否为Null
     * @param str
     * @return
     */
    public static Boolean isNull(String str) {
        if (str == null) {
            return true;
        }
        return false;
    }

}
