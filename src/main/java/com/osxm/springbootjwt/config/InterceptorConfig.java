/**
 * @Title: InterceptorConfig.java
 * @Package com.osxm.springbootjwt.config
 * @Description: TODO
 * @author oscarchen
 * @date 2019年12月14日
 * @version V1.0
 */
package com.osxm.springbootjwt.config;

import java.util.ArrayList;
import java.util.List;

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
		List<String> excludePathPatterns = new ArrayList<String>();
		excludePathPatterns.add("/login");
		excludePathPatterns.add("/swagger-ui.html");
		excludePathPatterns.add("/swagger-resources/**");
		excludePathPatterns.add("/v2/api-docs");
		excludePathPatterns.add("/webjars/springfox-swagger-ui/**");
		registry.addInterceptor(authInterceptor()).addPathPatterns("/*").excludePathPatterns(excludePathPatterns);
	}

	@Bean
	public AuthenticationInterceptor authInterceptor() {
		return new AuthenticationInterceptor();
	}
}
