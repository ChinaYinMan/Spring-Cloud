package com.common.base.utils;

import java.util.ArrayList;
import java.util.List;


/**
 * @description Java集合操作工具类
 * @author mantou
 * @param <T>
 */
public class CollectionUtil<T> {

    /**
     * 判断List为Null
     * @param list  List
     * @return Null-true; 非Null-false
     */
    public static<T> Boolean listIsNull(List<T> list) {
        if (list == null) {
            return true;
        }
        return false;
    }

    /**
     * 判断List不为Null
     * @param list List
     * @return  非Null-true; Null-false
     */
    public static<T> Boolean listIsNotNull(List<T> list) {
        if (!listIsNull(list)) {
            return true;
        }
        return false;
    }

    /**
     * 判断List为Empty
     * @param list  List
     * @return  Empty-true;  非Empty-false.
     */
    public static<T> Boolean listIsEmpty(List<T> list) {
        if (listIsNull(list) || list.size() == 0) {
            return true;
        }
        return false;
    }

    /**
     * 判断List不为Empty
     * @param list List
     * @return  非Empty-true;  Empty-false.
     */
    public static<T> Boolean listIsNotEmpty(List<T> list) {
        if (!listIsEmpty(list)) {
            return true;
        }
        return false;
    }

    public static void test(List list) {
        ArrayList arrayList = (ArrayList) list;
        arrayList.trimToSize();
    }

    public static void main(String [] args) {

    }
}
