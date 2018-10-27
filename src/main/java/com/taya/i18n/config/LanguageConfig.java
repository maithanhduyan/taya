/**
 * TAYAFOOD 2018
 */
package com.taya.i18n.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

/**
 * @author AnMTD
 */

@Configuration
public class LanguageConfig implements WebMvcConfigurer {

	@Bean(name = "localeResolver")
	public LocaleResolver getLocalResolver() {
	 
		CookieLocaleResolver resolver = new CookieLocaleResolver();
		resolver.setCookieDomain("tayaLocalCookie");
		resolver.setCookieMaxAge(60 * 60);
		return resolver;

	}
	
	@Bean (name="messageResource")
	public MessageSource getMessageResource() {
		
		ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
		messageResource.setBasename("classpath:i18n/language");
		messageResource.setDefaultEncoding("UTF-8");
		return messageResource;
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		localeChangeInterceptor.setParamName("lang");
		registry.addInterceptor(localeChangeInterceptor).addPathPatterns("/*");
		
	}

}
