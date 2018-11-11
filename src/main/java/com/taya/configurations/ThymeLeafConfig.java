/**
 * TayaFood 2018
 */
package com.taya.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * @author Mai Thành Duy An
 *
 */
public class ThymeLeafConfig {

	@Bean
	public ViewResolver htmlViewResolver() {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		return null;
	}

	@Bean
	public ITemplateResolver htmlTemplateResolver() {
		return null;
	}
}
