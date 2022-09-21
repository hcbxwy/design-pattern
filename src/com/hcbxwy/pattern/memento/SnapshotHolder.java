/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：SnapshotHolder.java</li>
 * <li>日期：2022/9/20 16:55</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.memento;

import java.util.Stack;

/**
 * 快照持有者
 *
 * @author Billson
 * @date 2022/9/20 16:55
 */
public class SnapshotHolder {

    private final Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
