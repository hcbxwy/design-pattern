/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：IdGeneratorOfHungry.java</li>
 * <li>日期：2022/9/2 11:05</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * ID生成器（线程内唯一的单例）
 *
 * @author Billson
 * @date 2022/9/2 11:05
 */
public class IdGeneratorOfThread {

    private final AtomicLong id = new AtomicLong(0);
    private static final ConcurrentHashMap<Long, IdGeneratorOfThread> instances = new ConcurrentHashMap<>();

    private IdGeneratorOfThread(){}

    public static IdGeneratorOfThread getInstance() {
        long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGeneratorOfThread());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
