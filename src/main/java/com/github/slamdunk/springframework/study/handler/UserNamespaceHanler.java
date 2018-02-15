package com.github.slamdunk.springframework.study.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.github.slamdunk.springframework.study.parser.UserBeanDefinitionParser;

/**
 * the handler map with the target namespace http://www.example.org/schema/user
 * @author liuzhongda
 *
 */
public class UserNamespaceHanler extends NamespaceHandlerSupport {

	public void init() {
		// TODO Auto-generated method stub
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}

}
