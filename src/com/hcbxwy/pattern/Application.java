/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：Application.java</li>
 * <li>日期：2022/9/2 13:40</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern;

import com.hcbxwy.pattern.singleton.IdGeneratorOfEnum;

/**
 * 程序类
 *
 * @author Billson
 * @date 2022/9/2 13:40
 */
public class Application {

    public static void main(String[] args) {
        System.out.println(IdGeneratorOfEnum.INSTANCE.getId());
    }
}
