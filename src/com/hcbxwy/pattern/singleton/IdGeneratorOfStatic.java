/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：IdGeneratorOfHungry.java</li>
 * <li>日期：2022/9/2 11:05</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * ID生成器（静态内部类）
 *
 * @author Billson
 * @date 2022/9/2 11:05
 */
public class IdGeneratorOfStatic {

    private final AtomicLong id = new AtomicLong(0);

    private IdGeneratorOfStatic(){}

    private static class SingletonHolder {
        private final static IdGeneratorOfStatic INSTANCE = new IdGeneratorOfStatic();
    }

    public static synchronized IdGeneratorOfStatic getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
