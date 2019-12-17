/**
 * @Title: InterceptorConfig.java
 * @Package com.osxm.springbootjwt.config
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月14日
 * @version V1.0
 */
package com.osxm.springbootjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.osxm.springbootjwt.aop.AuthenticationInterceptor;

/**
 * @ClassName: InterceptorConfig
 * @Description: TODO
 * @author oscarchen
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authInterceptor()).addPathPatterns("/users");
		//registry.addInterceptor(authInterceptor()).excludePathPatterns("/login");
		//registry.addInterceptor(authInterceptor()).excludePathPatterns("/swagger-ui.html");
		//registry.addInterceptor(authInterceptor()).excludePathPatterns("/swagger-resources/**");
		//registry.addInterceptor(authInterceptor()).excludePathPatterns("/v2/api-docs");
		//registry.addInterceptor(authInterceptor()).excludePathPatterns("/webjars/springfox-swagger-ui/**");
	}

	@Bean
	public AuthenticationInterceptor authInterceptor() {
		return new AuthenticationInterceptor();
	}
}
