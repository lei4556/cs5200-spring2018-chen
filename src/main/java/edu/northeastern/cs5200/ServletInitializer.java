package edu.northeastern.cs5200;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Cs5200Spring2018ChenApplication.class);
	}
	public static void main(String[] args) {

		  SpringApplication.run(
		  Cs5200Spring2018ChenApplication.class, args);

		 } 
}