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
 * 饿汉方式-写法1在静态常量赋值
 *
 * @author Billson
 * @date 2022/3/7 9:36
 */
public class Singleton1 {

    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
