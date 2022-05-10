package com.opower.assesment.openaq.OpenAQAPI.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableWebMvc
public class SpringFoxConfig {           
	
	@Bean("DOCS")
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.opower.assesment.openaq.OpenAQAPI.controllers"))
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("REST API for air quality",
				"It allows to conume Open air quality api and retrieve processed information", "API TOS",
				"The usage of this API is restricted only for Oracle Staff",
				new Contact("Isaac Rodríguez", "", "isaac.rocos@gmail.com"), "License of API",
				"API license URL", Collections.emptyList());
	}
}
