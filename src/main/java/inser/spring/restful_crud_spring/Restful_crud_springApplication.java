package inser.spring.restful_crud_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Restful_crud_springApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Restful_crud_springApplication.class, args);
	}
        
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Restful_crud_springApplication.class);
	}
}
