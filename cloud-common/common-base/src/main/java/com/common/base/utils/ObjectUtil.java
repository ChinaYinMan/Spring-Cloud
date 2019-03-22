package com.common.base.utils;

/**
 * Object工具类
 * @param <T>
 */
public class ObjectUtil<T> {

    /**
     * 如果oldT为Null,则返回newT
     * @param oldT
     * @param newT
     * @return
     */
    public static<T> T  ifNullReObject(T oldT, T newT) {
        if (isNull(oldT)) {
            return newT;
        }
        return oldT;
    }

    /**
     * 判断对象为Null
     * @param t
     * @return
     */
    public static<T> Boolean isNull(T t) {
        if (t == null) {
            return true;
        }
        return false;
    }
}
