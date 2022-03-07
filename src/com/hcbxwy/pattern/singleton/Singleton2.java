/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：Singleton1.java</li>
 * <li>日期：2022/3/7 9:36</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.singleton;

/**
 * 饿汉方式-写法2使用静态语句块
 *
 * @author Billson
 * @date 2022/3/7 9:36
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE;

    private Singleton2(){}

    static {
        INSTANCE = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
