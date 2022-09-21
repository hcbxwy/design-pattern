/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：Snapshot.java</li>
 * <li>日期：2022/9/20 17:43</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.memento;

/**
 * 快照
 *
 * @author Billson
 * @date 2022/9/20 17:43
 */
public class Snapshot {

    private final String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
