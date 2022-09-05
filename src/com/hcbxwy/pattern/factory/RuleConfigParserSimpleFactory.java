/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：RuleConfigParserSimpleFactory.java</li>
 * <li>日期：2022/9/2 16:51</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.factory;

/**
 * 简单工厂第一种写法
 *
 * @author Billson
 * @date 2022/9/2 16:51
 */
public class RuleConfigParserSimpleFactory {

    public static IRuleConfigParser createParser(String ruleConfigFileExtension) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        }
        return parser;
    }
}
