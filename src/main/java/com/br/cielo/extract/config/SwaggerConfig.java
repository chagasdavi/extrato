package com.br.cielo.extract.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 
 * @author dpereira
 * @since  01/04/2019
 * Configurações para o funcionamento do framework Swagger
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {

  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.br.cielo.extract"))
        .build()
        .apiInfo(metaData());

  }

  private ApiInfo metaData() {
    return new ApiInfoBuilder()
        .title("API Extrato - Cielo")
        .description("\"API para visualizar o extrato de todas as transações\"")
        .version("1.0.0")
        .license("Stefanini CO-CREATING SOLUTIONS FOR A BETTER FUTURE")
        .termsOfServiceUrl("Termo de uso: Todos os direitos reservados.")
        .licenseUrl("https://stefanini.com\"")
        .contact(this.contato())
        .build();
  }

  @Override
  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html")
        .addResourceLocations("classpath:/META-INF/resources/");

    registry.addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }
  
  private Contact contato() {
	  
		return new Contact(
				"Davi Pereira Chagas da Silva em 04/01/2019",
				"https://www.stefanini.com/", 
				"t0312dvp@prestadorcbmp.com.br");
	}
}
