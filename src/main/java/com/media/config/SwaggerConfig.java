package com.media.config;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.media"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        ApiInfo apiInfo = new ApiInfo(
                "Media Ponderada API REST",
                "API REST para Calculo de Media ponderada .",
                "1.0",
                "Terms of Service",
                new Contact("Rafael Fantinell", "https://github.com/RafaelFantinel",
                        "rafaeldeoliveirafantinel@hotmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }

}