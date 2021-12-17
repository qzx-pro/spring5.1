package com.qzx.selftag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {
	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String username = element.getAttribute("username");
		if (StringUtils.hasText(username)) {
			builder.addPropertyValue("username", username);
		}
		String password = element.getAttribute("password");
		if (StringUtils.hasText(password)) {
			builder.addPropertyValue("password", password);
		}
		String email = element.getAttribute("email");
		if (StringUtils.hasText(email)) {
			builder.addPropertyValue("email", email);
		}
	}

	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}
}
