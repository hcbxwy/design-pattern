/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：InputText.java</li>
 * <li>日期：2022/9/20 16:51</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.memento;

/**
 * 输入的文本
 *
 * @author Billson
 * @date 2022/9/20 16:51
 */
public class InputText {

    private final StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    /*
    // 非备忘录模式
    public void setText(String text) {
        this.text.replace(0, this.text.length(), text);
    }
    */

    public Snapshot createSnapshot() {
        return new Snapshot(getText());
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.text.replace(0, this.text.length(), snapshot.getText());
    }

}
