package com.main.testfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.util.StringUtils;


@SpringBootApplication
public class TestFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestFactoryApplication.class, args);
		System.out.println("Hello World");
	}

}
