/**
 * @Title: SwaggerConfig.java
 * @Package com.edu.badou.config
 * @Description: TODO
 * @author oscarchen
 * @date 2019年10月21日
 * @version V1.0
 */
package com.osxm.springbootjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName: SwaggerConfig
 * @Description: TODO
 * @author oscarchen
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).// 根据文档类型初始化
				apiInfo(swaggerApiInfo()) // 文档头信息
				.select().apis(RequestHandlerSelectors.basePackage("com.osxm.springbootjwt.controller")) // 过滤条件
				.paths(PathSelectors.any()) // 过滤路径
				.build();
	}

	/**
	 * 自定义API文档基本信息实体
	 * 
	 * @return
	 */
	private ApiInfo swaggerApiInfo() {

		Contact contact = new Contact("SpringBootJwt", "https://blog.csdn.net/oscar999/article/details/102735948",
				"xuemingchen83@163.com"); // 联系人，在UI界面会显示
		return new ApiInfoBuilder().contact(contact).title("SpringBootJwtRESTful API文档") // 文档标题
				.description("SpringBootJwtRESTful API文档") // 文档描述
				.version("1.0.0").build(); // 文档版本
	}
}
