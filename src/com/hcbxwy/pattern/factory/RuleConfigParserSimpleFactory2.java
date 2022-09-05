/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：RuleConfigParserSimpleFactory.java</li>
 * <li>日期：2022/9/2 16:51</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单工厂第二种写法
 *
 * @author Billson
 * @date 2022/9/2 16:51
 */
public class RuleConfigParserSimpleFactory2 {

    private static final Map<String, IRuleConfigParser> parserMap = new HashMap<>();

    static {
        parserMap.put("json", new JsonRuleConfigParser());
        parserMap.put("xml", new XmlRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String fileExt) {
        if (fileExt == null || fileExt.isEmpty()) {
            return null;
        }
        return parserMap.get(fileExt.toLowerCase());
    }
}
