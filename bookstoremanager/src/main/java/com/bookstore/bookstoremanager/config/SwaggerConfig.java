package com.bookstore.bookstoremanager.config;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final Contact CONTACT = new Contact("Vitor Mateus Weirich", "https://github.com/vitorweirich", "weirichvitor@gmail.com");
	private static final String DESCRIPTION = "BookStore API";
	private static final String TITLE = "BookStore Manager Course";
	private static final String BASE_PACKAGE = "com.bookstore.bookstoremanager";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
				.paths(PathSelectors.any())
//				.paths(PathSelectors.ant("/**"))
				.build()
				.apiInfo(buildApiInfo());
	}

	private ApiInfo buildApiInfo() {
		return new  ApiInfoBuilder()
				.title(TITLE)
				.description(DESCRIPTION)
				.version("1.0.0")
				.contact(CONTACT)
				.build();
	}
}
