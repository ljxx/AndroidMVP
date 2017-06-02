package com.ylx.androidmvp.mvpframe.util;

import java.lang.reflect.ParameterizedType;

/**
 * ========================================
 * <p/>
 * 版 权：蓝吉星讯 版权所有 （C） 2017
 * <p/>
 * 作 者：yanglixiang
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2017/6/2  上午10:53
 * <p/>
 * 描 述：
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class TUtil {
    public static <T> T getT(Object o, int i) {
        /**
         * getGenericSuperclass():获得带有范型的父类
         * ParameterizedType 参数化类型，即范型
         * getActualTypeArguments()[i] 获取参数化类型的数组，范型可能有多个
         */
        try {
            /**
             * getGenericSuperclass() : 获得带有泛型的父类
             * ParameterizedType ： 参数化类型，即泛型
             * getActualTypeArguments()[] : 获取参数化类型的数组，泛型可能有多个
             */
            return ((Class<T>) ((ParameterizedType) (o.getClass()
                    .getGenericSuperclass())).getActualTypeArguments()[i])
                    .newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获得类名className对应的Class对象
     * @param className
     * @return
     */
    public static Class<?> forName(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
