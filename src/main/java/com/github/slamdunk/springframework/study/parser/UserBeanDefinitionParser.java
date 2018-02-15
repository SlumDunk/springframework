package com.github.slamdunk.springframework.study.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.github.slamdunk.springframework.study.vo.User;

/**
 * custom parser for the tag <user/> in the application-context.xml
 * 
 * @author liuzhongda
 *
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	// 从elelment中解析并提取对应的元素
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {

		String name = element.getAttribute("name");
		String email = element.getAttribute("email");
		String sex = element.getAttribute("sex");
		String id=element.getAttribute("id");
		// 将提取到的数据放入beanDefinitionBuilder 中，待完成所有的bean解析后统一放到beanfactory
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("name", name);
		}
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
		if (StringUtils.hasText(sex)) {
			builder.addPropertyValue("sex", sex);
		}
		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}

	}
}
