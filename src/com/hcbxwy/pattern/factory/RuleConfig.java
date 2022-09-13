/*
 * <ul>
 * <li>项目名称：design-pattern</li>
 * <li>文件名称：RuleConfig.java</li>
 * <li>日期：2022/9/2 16:42</li>
 * <li>Copyright ©2016-2022 广州职赢未来信息科技有限公司 All Rights Reserved.</li>
 * </ul>
 */
package com.hcbxwy.pattern.factory;

import com.sun.deploy.net.proxy.DynamicProxyManager;

import java.lang.reflect.Proxy;

/**
 * 规则配置
 *
 * @author Billson
 * @date 2022/9/2 16:42
 */
public class RuleConfig {

    public RuleConfig load(String filePath) {
        String fileExt = getFileExt(filePath);
        // 通过简单工厂创建
        //IRuleConfigParser parser = RuleConfigParserSimpleFactory.createParser(fileExt);

        // 通过工厂方法创建
        IRuleConfigFactory factory = null;
        if ("json".equalsIgnoreCase(fileExt)) {
            factory = new JsonRuleConfigParserMethodFactory();
        } else if ("xml".equalsIgnoreCase(fileExt)) {
            factory = new XmlRuleConfigParserMethodFactory();
        }
        IRuleConfigParser parser = factory.createParser(fileExt);


        return parser.parser("");
    }

    private String getFileExt(String filePath) {
        return filePath.substring(filePath.lastIndexOf(".") + 1);
    }

    public static void main(String[] args) {
        String s1 = "小争哥";String s2 = "小争哥";String s3 = new String("小争哥");System.out.println(s1 == s2);System.out.println(s1 == s3);
    }
}
