package in.bharat.config;

import static springfox.documentation.builders.PathSelectors.regex;
import static  springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Bharat patel
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createDocket() {
		//create empty Docket
		return new Docket(DocumentationType.SWAGGER_2)
		.select()  //find controller classes

		//provide all controller common package name
		.apis(basePackage("in.bharat.controller"))

		//provide one common path of controllers
		.paths(regex("/rest.*"))

		.build() //create Docket with details

		.apiInfo(apiInfo())
		;
	}


	private ApiInfo apiInfo() {
		return new ApiInfo(
				"WELCOME TO SPRING BOOT CURD OPERATION WITH ORACLE DB APP",
				"This is used to Test Application only",
				"R-3.5 GA", "https://oracle.com/",
				new Contact("oracle", "https://oracle.com", "erbharatpatelp@gmail.com"),
				"Oracle Corp Licence", "https://oracle.com", new ArrayList<VendorExtension>());
	}

}





