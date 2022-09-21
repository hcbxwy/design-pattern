/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：ApplicationMain.java</li>
 * <li>日期：2022/9/20 17:00</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.memento;

import java.util.Scanner;

/**
 * 应用主程序
 *
 * @author Billson
 * @date 2022/9/20 17:00
 */
public class ApplicationMain {

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (":list".equals(input)) {
                System.out.println(inputText.getText());
            } else if (":undo".equals(input)) {
                //InputText popSnapshot = snapshotHolder.popSnapshot();
                //inputText.setText(popSnapshot.getText());

                Snapshot snapshot = snapshotHolder.popSnapshot();
                inputText.restoreSnapshot(snapshot);
            } else {
                //snapshotHolder.pushSnapshot(inputText);

                snapshotHolder.pushSnapshot(inputText.createSnapshot());
                inputText.append(input);
            }
        }
    }
}
