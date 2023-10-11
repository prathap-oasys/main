package com.student.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetailsApplication.class, args);
	}
		/*
		public class JettyConfig{
		
			@Bean
		public JettyServletWebServerFactory JettyServletWebServerFactory() {
			JettyServletWebServerFactory factory =new JettyServletWebServerFactory(8080);
			
			return factory;
		}
			
		}
		*/
		
	

}
