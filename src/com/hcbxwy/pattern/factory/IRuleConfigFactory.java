/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：IRuleConfigFactory.java</li>
 * <li>日期：2022/9/2 17:00</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.factory;

/**
 * TODO 用一句话描述用途
 *
 * @author Billson
 * @date 2022/9/2 17:00
 */
public interface IRuleConfigFactory {

    IRuleConfigParser createParser(String fileExt);
}
